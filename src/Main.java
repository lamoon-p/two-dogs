public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog Mha1 = new Dog("Showkuay", "Dachshund");
        Dog Mha2 = new Dog("MheeYao", "Mastiff");

        Mha1.setName("ShaoKuay");
        Mha2.setName("MheeYai");
        Mha2.setBreed("Tibetan Mastiff");

        String info1 = "1. Name:" + Mha1.getName() + " / Breed: " + Mha1.getBreed();
        String info2 = "2. Name:" + Mha2.getName() + " / Breed: " + Mha2.getBreed();
        System.out.println(info1);
        System.out.println(info2);
    }
}
