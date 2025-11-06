public class occuranceofpattern {
    public static void main(String[] args) {
        String s="geeks for geeks";
        String p="geeks";
        patSearch(s,p);
        String no ="12.6543";
        System.out.println( afterDecimal(no));;
    }
    static void patSearch(String txt,String pat){
        int position = txt.indexOf(pat);
        while(position>=0){
            System.out.print(position+" ");
            position=txt.indexOf(pat,position+1);
        }
    }
    static  String afterDecimal(String no){
        int pos = no.indexOf('.');
        if(pos<0){
            return "";
        }
        else {
            return no.substring(pos+1);
        }


    }

    //Find out extra character
    
}
