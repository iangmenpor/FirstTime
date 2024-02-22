package com.ianM.firstTime.features.presentation;

import com.ianM.firstTime.features.data.FileDataRepository;
import com.ianM.firstTime.features.domain.CreateFileUseCase;
import com.ianM.firstTime.features.domain.FirstTimeCheckerUseCase;
import com.ianM.firstTime.features.domain.GetCountUseCase;
import com.ianM.firstTime.features.domain.IncreaseCountUseCase;

import java.io.File;

public class FileMain {


    public static boolean Check(File filename){
        FirstTimeCheckerUseCase firstTimeCheckerUseCase = new FirstTimeCheckerUseCase(FileDataRepository.getInstance());
        return firstTimeCheckerUseCase.execute(filename);
    }
    public static File create(String filename) {
        CreateFileUseCase createFileUseCase = new CreateFileUseCase(FileDataRepository.getInstance());
        return createFileUseCase.execute(filename);
    }
    public static int getContador(File file){
        GetCountUseCase getCountUseCase = new GetCountUseCase(FileDataRepository.getInstance());
        return getCountUseCase.execute(file);
    }
    public static void increaseContador(File file){
        IncreaseCountUseCase increaseCountUseCase = new IncreaseCountUseCase(FileDataRepository.getInstance());
        increaseCountUseCase.execute(file);
    }
}
