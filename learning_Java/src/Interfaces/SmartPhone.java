package Interfaces;

public class SmartPhone extends Phone implements ICamera, IMusicPlayer{
    @Override
    public void click() {
        System.out.println("SmartPhone clicking photos");
    }

    @Override
    public void record() {
        System.out.println("SmartPhone Recording videos");
    }

    @Override
    public void play() {
        System.out.println("SmartPhone playing music");
    }

    @Override
    public void stop() {
        System.out.println("SmartPhone stopped playing music");
    }

    public void call() {
        System.out.println("SmartPhone calling");
    }
}
