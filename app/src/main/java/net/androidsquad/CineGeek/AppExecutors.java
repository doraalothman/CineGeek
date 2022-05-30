package net.androidsquad.CineGeek;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class AppExecutors {
    // Singleton Pattern:  çalışma zamanında yalnızca
    // 1 object yaratılmasını garanti eden tasarım desenidir
    //Birden çok sınıfın aynı instance'ı kullanması gerekmektedir.
    //Tüm uygulama için yalnızca bir nesne olması gerekmektedir.
    private static AppExecutors instance;

    public static AppExecutors getInstance(){
        if (instance == null){
            instance = new AppExecutors();
        }
        return instance;
    }


    private final ScheduledExecutorService mNetworkIO = Executors.newScheduledThreadPool(3);

    public ScheduledExecutorService networkIO(){
        return mNetworkIO;
    }


}
