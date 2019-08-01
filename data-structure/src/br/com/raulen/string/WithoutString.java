package br.com.raulen.string;

public class WithoutString {

    public static void main(String[] args) {
        without("Hello There", "llo");
    }

    public static void without(String base, String remove) {
        if (base != null && remove != null) {
            String result = base.toLowerCase().replaceAll(remove.toLowerCase(), "");
            System.out.println(result);
        }
    }

}
