package com.github.coffeeframework.basickhlvlpackage;

/**
 * Interface declaring the methods that must be included in a parser
 * for a feature model into the basic dialect of HLVL (Hlvl(basic))
 * @author Angela Villota
 * Coffee V1
 * January 2019
 */
public interface IHlvlParser {
	
	/**
	 * Method to formatting the name of an element in a valid name 
	 * for hlvl (no spaces, no symbols, etc)
	 * @param name is the identifier of the element
	 * @return a String with formatted name
	 */
	public String getValidName(String name);
	
	/**
	 * Method to do the parsing of a xml file to Hlvl
	 * @throws Exception when there were issues doing the parsing of the xml file
	 */
	public void parse() throws Exception;
	
	/**
	 * Method to do the parsing of a xml file to Hlvl
	 * @param data: String that represents the content of a xml file
	 * @return returns a string representing the hlvl variabilty model
	 * @throws Exception when there were issues doing the parsing
	 */
	public String parse(String data)throws Exception;
	
	


}
