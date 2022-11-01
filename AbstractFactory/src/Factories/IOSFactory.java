package Factories;

import Interfaces.Interfaces;
import IOS.IOSAction;
import IOS.IOSOption;
import IOS.IOSSuperAction;

public class IOSFactory implements Interfaces.Factory {
    public IOSFactory() {
        System.out.println("creating IOS factory");
    }

    public Interfaces.Action action() {
        System.out.println("creating IOS action");
        return (Interfaces.Action) new IOSAction();
    }

    public Interfaces.Option option() {
        System.out.println("creating IOS option");
        return (Interfaces.Option) new IOSOption();
    }

    public Interfaces.SuperAction superAction() {
        System.out.println("creating IOS super action");
        return (Interfaces.SuperAction) new IOSSuperAction();
    }
}
