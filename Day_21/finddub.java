class finddub{
    public static void main(String[] args) {
        String str="programming";
        for(int i=0;i<str.length();i++){
            int cnt=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)) cnt++;
            }
            if(cnt>1) System.err.println(str.charAt(i)+" found "+cnt+" times");
        }
    }
}