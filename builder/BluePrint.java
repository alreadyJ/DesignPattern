package builder;

abstract public class BluePrint {
    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorage();
    abstract public Computer getComputer();
}
