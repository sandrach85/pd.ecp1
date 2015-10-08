package factoryMethod;

public abstract class LanguageManager {
	public NumberValue number;
	public NaturalNumber language;
	
	
    public void setCreator(NaturalNumber language) {
        this.language = language;
    }
    
    public NaturalNumber getNaturalNumber(){
    	return language;
    }
    
    public abstract NumberValue createLanguage();
  
}
