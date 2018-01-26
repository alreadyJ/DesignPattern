package builder;

public class LgGramBluePrint extends BluePrint {
    Computer computer;

    public LgGramBluePrint() {
        computer = new Computer("default", "default", "default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("16g");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

    @Override
    public void setStorage() {
        computer.setStorage("256g ssd");
    }
}
