package uk.ac.qub.oo;

public class Animal {
	
	/**
	 * The name of the animal
	 */
	private String name;
	
	/**
	 * The noise the animal makes
	 */
	private String noise;
	
	/**
	 * Eye colour for the animal
	 */
	private String eyeColour;
	
	/**
	 * The nose type
	 */
	private String noseType;
	
	/**
	 * The paw size
	 */
	private String pawSize;
	
	/**
	 * Animal's fur colour
	 */
	private String furColour;
	
	/**
	 * Returns the name of the animal
	 * @return the animal's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the animal 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * Get the animal's noise
	 * @return the Animal's noise
	 */
	public String getNoise() {
		return noise;
	}
	
	/**
	 * Sets the animal's noise
	 * @param noise
	 */
	public void setNoise(String noise) {
		this.noise = noise;
	}

	/**
	 * Gets the eye colour
	 * @return eye colour
	 */
	public String getEyeColour() {
		return eyeColour;
	}

	/**
	 * Sets the eye colour
	 * @param eyeColour
	 */
	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}

	/**
	 * Gets and returns the nose type
	 * @return the noseType
	 */
	public String getNoseType() {
		return noseType;
	}

	/**
	 * Sets the nose type
	 * @param noseType the noseType to set
	 */
	public void setNoseType(String noseType) {
		this.noseType = noseType;
	}

	/**
	 * Gets and returns  the paw size of the animal
	 * @return the pawSize
	 */
	public String getPawSize() {
		return pawSize;
	}

	/**
	 * Sets the paw size of the animal
	 * @param pawSize the pawSize to set
	 */
	public void setPawSize(String pawSize) {
		this.pawSize = pawSize;
	}

	/**
	 * The fur colour of the animal
	 * @return the furColour
	 */
	public String getFurColour() {
		return furColour;
	}

	/**
	 * Sets the animal's fur colour
	 * @param furColour the furColour to set
	 */
	public void setFurColour(String furColour) {
		this.furColour = furColour;
	}
	
	/**
	 * Method outputs to screen the animal's noise
	 */
	public void makeNoise(){
		System.out.println(this.noise);
	}
}
