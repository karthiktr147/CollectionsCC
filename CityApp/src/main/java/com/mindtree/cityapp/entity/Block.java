package com.mindtree.cityapp.entity;

public class Block {
	private int blockId;
	private String blockName;

	public Block() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Block(int blockId, String blockName) {
		super();
		this.blockId = blockId;
		this.blockName = blockName;
	}
	

	public int getBlockId() {
		return blockId;
	}

	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + blockId;
		result = prime * result + ((blockName == null) ? 0 : blockName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Block other = (Block) obj;
		if (blockId != other.blockId)
			return false;
		if (blockName == null) {
			if (other.blockName != null)
				return false;
		} else if (!blockName.equals(other.blockName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Block [blockId=" + blockId + ", blockName=" + blockName + "]";
	}
	

}
