package models;


public class Enemy extends Attacker{

	private int pointVal;
	private int dropChance;
	private boolean isDropping;
	private boolean canMove = true;
	private boolean canMoveHorizontal;
	private boolean canMoveVertical;
	


	public int getPointVal() {
		return pointVal;
	}

	public void setPointVal(int pointVal) {
		this.pointVal = pointVal;
	}

	public int getDropChance() {
		return dropChance;
	}

	public void setDropChance(int dropChance) {
		this.dropChance = dropChance;
	}

	public boolean isDropping() {
		return isDropping;
	}

	public void setDropping(boolean isDropping) {
		this.isDropping = isDropping;
	}

	public Enemy(String name, int pointVal, int dropChance, Projectile gun) {
		super(name);
		setPointVal(pointVal);
		setDropChance(dropChance);
		setGun(gun);
	}

}
