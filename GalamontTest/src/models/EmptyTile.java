package models;

public class EmptyTile extends ModelComponent {
	public EmptyTile() {
		super("   ");
	}

	
	@Override
	public boolean checkIfIsShowable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setShowability(boolean canShow) {
		// TODO Auto-generated method stub
		
	}


}
