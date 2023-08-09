package homework3.main.classes;

import homework3.main.abstractC.ACheckDataProcessor;
import homework3.main.abstractC.AFileWriter;
import homework3.main.abstractC.APresenter;
import homework3.main.classes.parseData.CDataParseProcessor;
import homework3.main.classes.format.GetData;
import homework3.main.classes.workFile.CFindTheSameFileName;

import java.io.IOException;

public class Presenter extends APresenter {
    private final GetData getData;
    private final CDataParseProcessor dataParseProcessor;

    private final ACheckDataProcessor dataProcessor;
    private final AFileWriter fileWriter;

    /**
     * Объединяет в работу пользовательский интерфейс, парсер строки, проверку на валидность элементов строки
     * Пишет в файлы инфо по заданному формату.
     * @param getData - пользовательский интерфейс.
     * @param dataParseProcessor - парсер строки.
     * @param dataProcessor - проверка элементов на валидность
     * @param fileWriter - пишет в файл согласно условию.
     */
    public Presenter(GetData getData,
                     CDataParseProcessor dataParseProcessor,
                     ACheckDataProcessor dataProcessor,
                     AFileWriter fileWriter
    ) {
        this.getData = getData;
        this.dataParseProcessor = dataParseProcessor;
        this.dataProcessor = dataProcessor;
        this.fileWriter = fileWriter;
    }

    @Override
    public void run() throws IOException {
        dataParseProcessor.parseData(getData.getData());
        //Check quantity
        dataProcessor.checkQuantity(dataParseProcessor.getDataArray());
        //Check full name
        dataProcessor.checkFullName(dataParseProcessor.getFullName());
        //Check birthday
        dataProcessor.checkBirthday(dataParseProcessor.getBirthday());
        //Check sex
        dataProcessor.checkSex(dataParseProcessor.getSex());
        System.out.println("\nAll checks are FINE!!!");
        // Write data to file
        fileWriter.writeToFile(dataParseProcessor.getInfoToWrite());
    }
}