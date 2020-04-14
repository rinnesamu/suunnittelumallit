package adapter;

public class Adapter implements IDigitalSignal {
	
	private String picture, convertedPicture;
	private IAnalogSignal signal;
	
	public Adapter() {
		this.signal = new AnalogSignal();
		this.picture = signal.getPicture();
		this.convertedPicture = "";
		convertSignal();
	}

	@Override
	public String getPicture() {
		return this.convertedPicture;
	}
	
	public void convertSignal() {
		int n = picture.length(); 
        for (int i = 0; i < n; i++)  
        { 
            // convert each char to 
            // ASCII value 
            int val = Integer.valueOf(picture.charAt(i)); 
  
            // Convert ASCII value to binary 
            String letter = ""; 
            while (val > 0)  
            { 
                if (val % 2 == 1) 
                { 
                	letter += '1'; 
                } 
                else
                	letter += '0'; 
                val /= 2; 
            }
         
            letter = reverse(letter);
            while(letter.length() < 8) { // jättää etunollat pois, joten lisätään ne
            	letter = "0"+letter;
            }
            convertedPicture =  convertedPicture + letter + " ";
            
        } 	
	}
	
	static String reverse(String input)  
    { 
        char[] a = input.toCharArray(); 
        int l, r = 0; 
        r = a.length - 1; 
  
        for (l = 0; l < r; l++, r--) 
        { 
            // Swap values of l and r  
            char temp = a[l]; 
            a[l] = a[r]; 
            a[r] = temp; 
        } 
        return String.valueOf(a); 
    } 

}
