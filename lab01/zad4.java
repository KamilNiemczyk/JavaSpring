class Zad4{
    public static void writeStarsFirstComponent(int n){
        for(int i = 1; i < n; i++){
            String stars = new String(new char[i]).replace("\0", "*");
            System.out.println(stars);
        }
        for (int i = n; i > 0; i--){
            String stars = new String(new char[i]).replace("\0", "*");
            System.out.println(stars);
        }
    }
    public static void writeStarsSecondComponent(int n){
        for (int i = n; i > 0; i--){
            String stars = new String(new char[n-i]).replace("\0", " ");
            stars += new String(new char[i]).replace("\0", "*");
            System.out.println(stars);
        }
        for(int i = 1; i < n; i++){
            String stars = new String(new char[n-i]).replace("\0", " ");
            stars += new String(new char[i]).replace("\0", "*");
            System.out.println(stars);
        }
    }
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Nie podano argumentu");
        }else{
            int n = Integer.parseInt(args[0]);
            writeStarsFirstComponent(n);
            writeStarsSecondComponent(n);
        }
    }
}