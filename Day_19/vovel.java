class vovel{
    public static void main(String[] args) {
        String str= "Rushikesh";
        int cnt=0;
        for(char ch: str.toLowerCase().toCharArray()){
            if(ch =='a' || ch =='e' || ch=='i' || ch =='o' || ch=='u'){cnt++; }
        }
        System.err.println("Numbe of vovels in "+str+" is "+cnt);
    }
}