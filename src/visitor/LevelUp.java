package visitor;

public class LevelUp implements Visitor {
	
	@Override
	public boolean levelUp(Charmander c) {
		if (c.getExp() >= 20) {
			return true;
		}
		return false;
	}

	@Override
	public boolean levelUp(Charmaleon c) {
		if (c.getExp() >= 50) {
			return true;
		}
		return false;
	}

}
