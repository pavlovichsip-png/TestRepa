public class LoadComp implements ILoad {
    @Override
    public void load(Computer computer) {
        System.out.println("Выгрузка объекта из файла: " + computer);
    }
}
