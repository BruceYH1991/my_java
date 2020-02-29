package EnumTest;

public enum Colours {
    red(1, "red"),
    white(2, "white"),
    black(3, "black"),
    blue(4, "blue");

    Integer code;
    String name;

    public Integer getCode () {
        return code;
    }

    public String getName () {
        return name;
    }

    public static void main (String[] args) {
        System.out.println(Colours.black.getCode());
        System.out.println(Colours.black.getName());

    }

//    public void setCode (Integer code) {
//        this.code = code;
//    }
//
//    public void setName (String name) {
//        this.name = name;
//    }

    Colours(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    Colours () {
    }


}
