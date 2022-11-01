package Factories;

import Android.AndroidAction;
import Android.AndroidOption;
import Android.AndroidSuperAction;
import Interfaces.Interfaces;
import Interfaces.Interfaces.Action;
import Interfaces.Interfaces.Option;
import Interfaces.Interfaces.SuperAction;


public class AndroidFactory implements Interfaces.Factory {
    public AndroidFactory() {
        System.out.println("creating Android factory");
    }

    @Override
    public Action action() {
        System.out.println("creating Android action");
        return (Action) new AndroidAction();
    }

    @Override
    public Option option() {
        System.out.println("creating Android option");
        return (Option) new AndroidOption();
    }

    @Override
    public SuperAction superAction() {
        System.out.println("creating Android super action");
        return (SuperAction) new AndroidSuperAction();
    }
}
