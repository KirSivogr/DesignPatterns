import Android.AndroidSuperAction;
import Factories.AndroidFactory;
import Factories.IOSFactory;
import Interfaces.Interfaces;

public class Application {
    public void configApplication(String os) {
        Interfaces.Factory factory;

        if (os.toLowerCase().equals("ios")) {
            factory = new IOSFactory();
        }
        else if (os.toLowerCase().equals("android")) {
            factory = new AndroidFactory();
        }
        else {
            System.out.println("Unknown OS :(");
            return;
        }

        Interfaces.Action action;
        Interfaces.Option option;
        Interfaces.SuperAction superAction;

        action = factory.action();
        option = factory.option();
        superAction = factory.superAction();

        action.getAction();
        option.getOption();
        superAction.getSuperAction();
    }
}
