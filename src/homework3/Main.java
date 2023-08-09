package homework3;

import homework3.main.classes.Presenter;
import homework3.main.classes.checkInputData.*;
import homework3.main.classes.format.GetData;
import homework3.main.classes.parseData.CDataParseProcessor;
import homework3.main.classes.workFile.CFileCreator;
import homework3.main.classes.workFile.CFileWriter;
import homework3.main.classes.workFile.CFindTheSameFileName;

import java.io.IOException;

/**
 * Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
 * Фамилия Имя Отчество датарождения номертелефона пол
 * <p>
 * Форматы данных:
 * фамилия, имя, отчество - строки
 * датарождения - строка формата dd.mm.yyyy
 * номертелефона - целое беззнаковое число без форматирования
 * пол - символ латиницей f или m.
 * <p>
 * ЧТОБЫ НЕ УСЛОЖНЯТЬ ВСЕ МОЖЕТ БЫТЬ String;
 * <p>
 * Приложение должно проверить введенные данные по количеству.
 * Если количество не совпадает с требуемым, бросить исключение,
 * обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
 * <p>
 * Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
 * Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
 * Можно использовать встроенные типы java и создать свои.
 * Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
 * <p>
 * Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
 * в него в одну строку должны записаться полученные данные, вида
 * <p>
 * <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
 * <p>
 * Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
 * <p>
 * Не забудьте закрыть соединение с файлом.
 * <p>
 * При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
 * пользователь должен увидеть стектрейс ошибки.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // Путь к папке с файлами
        String infoPathFolder = "src/homework3/data/";
        Presenter presenter = new Presenter(new GetData(),
                new CDataParseProcessor(),
                new CheckDataProcessor(new CheckQuantity(),
                        new CheckFullName(),
                        new CheckBirthday(),
                        new CheckSex()),
                new CFileWriter(new CFileCreator(),
                        new CFindTheSameFileName(),
                        infoPathFolder));
        presenter.run();
    }
}
