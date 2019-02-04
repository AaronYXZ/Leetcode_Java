package String;

import java.util.HashSet;
import java.util.Set;

public class L929_UniqueEmailAddresses {

    // string.split string.replace set.size()

    public static int numUniqueEmails(String[] emails){
        Set<String> uniqueEmails = new HashSet<>();
        int result = 0;
        for (String email:emails){
            String emailLocal = email.split("@")[0].split("\\+")[0].replace(".", "");
            String emailHost = email.split("@")[1];
            String emailCleaned = emailLocal + "@" + emailHost;
                uniqueEmails.add(emailCleaned);
        }
        return uniqueEmails.size();
    }

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int result = numUniqueEmails(emails);
    }
}
