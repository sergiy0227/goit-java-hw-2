public class NameEncoderDecoder {
    public String encode(String name) {
        name = "NOTFORYOU" + name + "YESNOTFORYOU";
        return name.replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");
    }

    public String decode(String name) {
        return name.replace("YESNOTFORYOU", "")
                .replace("NOTFORYOU", "")
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");
    }

    public static void main(String[] args) {
        NameEncoderDecoder decoder = new NameEncoderDecoder();

        String encode = decoder.encode("Crab");
        System.out.println("decoder.encode(\"Crab\") = " + decoder.encode("Crab"));

        String decode = decoder.decode("NOTFORYOUCr5bYESNOTFORYOU");
        System.out.println("decoder.decode(\"NOTFORYOUCr5bYESNOTFORYOU\") = " + decoder.decode("NOTFORYOUCr5bYESNOTFORYOU"));

        decode = decoder.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU");
        System.out.println("decoder.decode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\") = " + decoder.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
    }
}
