package com.github.coffeeframework.basickhlvlpackage;

import java.util.List;

public class CnfExpFactory implements HlvlBasicKeys{

	/**
	 * Parse a single conjunctive normal form (dimacs format) into a hlvl's expression sentence
	 * @param positives list of positive literals from the CNF expression
	 * @param negatives list of negative literals from the CNF expression
	 * @param numId string that represent a relation "r"
	 * @param id index of the current relation in the hlvl model
	 * @return an hlvl expression sentence equivalent to the CNF  expression
	 */
	public String getCNF2expression(List<String> positives, List<String> negatives, int numId, String id) {
		String out= id+ (numId++) + COLON+  EXPRESSION+ OPEN_CALL;

		for(String element: negatives){
			out +=  NEG+ element+ SPACE+  L_OR + SPACE;
		}
		for(String element: positives){
			out +=  element+ SPACE+ L_OR + SPACE;
		}

		out = out.substring(0, out.length() -3)+ CLOSE_CALL + "\n";

		return out; 
	}
}
