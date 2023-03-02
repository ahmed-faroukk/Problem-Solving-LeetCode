class Solution {
    public int numUniqueEmails(String[] emails) {
           HashSet<String> set = new HashSet<>();
        int counter =0 ;

        for(int i = 0 ; i<emails.length ; i++){
            String mail = emails[i] ;
            int plus = mail.indexOf('+');
            int att = mail.indexOf('@');
            String mailFilter= "";
            if (plus>=0)
                mailFilter = mail.substring(0 , plus);
            else
                mailFilter = mail.substring(0 , att);
            //remove . from mail


            mailFilter  = mailFilter.replace(".","");
            mailFilter += mail.substring(att);

            if (set.add(mailFilter))
                counter++;


        }
        return counter;

    }
}
