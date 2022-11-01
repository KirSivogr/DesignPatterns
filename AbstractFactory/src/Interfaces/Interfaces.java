package Interfaces;

public class Interfaces {
    public interface Action {
        void getAction();
    }
    public interface Option {
        void getOption();
    }
    public interface SuperAction {
        void getSuperAction();
    }
    public interface Factory {
        Action action();
        Option option();
        SuperAction superAction();
    }
}
