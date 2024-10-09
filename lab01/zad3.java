class Zad3{
    public static float calculate(String planeta, Float sekundy){
        Float ziemia = sekundy/31557600;
        switch(planeta){
            case "Merkury":
                return ziemia/0.24f;
            case "Wenus":
                return ziemia/0.62f;
            case "Ziemia":
                return ziemia;
            case "Mars":
                return ziemia/1.88f;
            case "Jowisz":
                return ziemia/11.86f;
            case "Saturn":
                return ziemia/29.45f;
            case "Uran":
                return ziemia/84.02f;
            case "Neptun":
                return ziemia/164.8f;
            default:
                return 0;
        }
    }
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Nie podano argumentu");
        }else{
            String planeta = args[0];
            Float sekundy = Float.parseFloat(args[1]);
            System.out.println("Wiek na planecie " + planeta + " wynosi " + calculate(planeta, sekundy) + " lat");
        }
    }
}