public class SaveComp implements ISave{
    @Override
    public void save(Computer computer) {
        System.out.println("Загрузка объекта в файл: " + computer);
    }
}
