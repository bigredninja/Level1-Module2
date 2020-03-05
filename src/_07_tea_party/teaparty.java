package _07_tea_party;

public class teaparty {
	
        public String welcome(String name, boolean isWoman, boolean isKnighted) {
        	String message = ("");
        	message += "Hello" ;
        if (  isWoman && isKnighted) {
			message += " Lady ";
		}
        if (isKnighted && !isWoman) {
			message += " Sir ";
		}
        if (isWoman && !isKnighted) {
			message += " Ms. ";
		}
        if (!isKnighted && !isWoman ) {
			message += " Mr. ";
		}
        message += name ;
        	return message;
        }
       
}

