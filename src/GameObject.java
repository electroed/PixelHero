/*
 * This class is the basis for all characters and objects in the game
 * 
 */
public class GameObject {
	protected char type_id = '0'; // let's say this means undefined
	protected int row_index = 0;
	protected int column_index = 0; 
	public boolean isItem = false;
	public boolean isObstacle = false;
	
	protected boolean canBeSteppedOn = false;
	
	protected String description = "default object";
	
	
	public char getTypeId()
	{
		return type_id;
	}
	
	public void setRowIndex(int index)
	{
		row_index = index;
	}
	
	public void setColumnIndex(int index)
	{
		column_index = index;
	}
	
	public int getRowIndex()
	{
		return row_index;
	}
	public int getColumnIndex()
	{
		return column_index;
	}
	
	public boolean canBeSteppedOn()
	{
		return canBeSteppedOn;
	}
	
	public String getDescription()
	{
		return description;
	}
	
}
