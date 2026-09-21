public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Acer", 256_000);
        SaveComp saveComp = new SaveComp();
        saveComp.save(computer);
    }
}
