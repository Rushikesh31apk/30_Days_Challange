class vovel{
    public static void main(String[] args) {
        String str= "Rushikesh";
        int vovel=0;
        int consonent=0;
        for(char ch: str.toLowerCase().toCharArray()){
            if(ch =='a' || ch =='e' || ch=='i' || ch =='o' || ch=='u'){vovel++; }
            else if(ch > 'a' && ch <= 'z'){ consonent++;}
        }
        System.err.println("Numbe of vovels in "+str+" is "+ vovel +" and consonet is "+ consonent);
    }
}