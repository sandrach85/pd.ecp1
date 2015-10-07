package factoryMethod;

public abstract class LanguageManager {
	public NumberValue number;
	public NaturalNumber language;
	
	
    public void setCreator(NaturalNumber language) {
        this.language = language;
    }
    
  
}
