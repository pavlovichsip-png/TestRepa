public class OmenHP extends Computer{
    public OmenHP(String name, int memory_size) {
        super(name, memory_size);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        this.memory_size = 80_000;
    }
}
