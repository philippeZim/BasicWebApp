package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else if(query.contains("2269d5d0")){
            return "493";
        }else if(query.contains("1f1ee2d0")){
            return "716";
        }else if(query.contains("1be2e3e0")){
            return "27";
        }else { // TODO extend the programm here
            return "";
        }
    }
}
