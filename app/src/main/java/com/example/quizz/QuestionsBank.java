package com.example.quizz;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class QuestionsBank {

    private static List<QuestionsList> kgzQuestions(){

        final List<QuestionsList> questionsList=new ArrayList<>();
        final QuestionsList question1=new QuestionsList("Входила ли Киргизия в СССР?",
                "Да", "Нет", "незнаю", "вапше незнаю",
                "Да","");

        final QuestionsList question2=new QuestionsList("Столица Кыргызстана?",
                "Араван", "Ош", "Токтогул", "Бишкек",
                "Бишкек","");

        final QuestionsList question3=new QuestionsList(  "Какая валюта в Киргизии?",
                "ом", "сом", "сум", "евро",
                "сом","");

        final QuestionsList question4=new QuestionsList(  "Первый призидент Кыргызстана",
                "Э.Бекболиев", "С.Жапаров", "А.Атамбаев", "А.Акаев",
                "А.Акаев","");

        final QuestionsList question5=new QuestionsList(  "Кто написал роман Пегий пёс",
                "Н.Керимбеков", "Ч.Айтматов", "Пушкин", "Лермонтов",
                "Ч.Айтматов","");

        final QuestionsList question6=new QuestionsList(  "Где находится Сулайман-Тоо",
                "Ош", "Токтогул", "Джалал-абад", "Москве",
                "Ош","");

        final QuestionsList question7=new QuestionsList(  "Первый секретарь в Кыргызстане",
                "Т.Усбалиев", "Ч.Айтматов", "И.Раззаков", "А.Акаев",
                "И.Раззаков","");

        final QuestionsList question8=new QuestionsList(  "Акжол Махмудов где родился",
                "в Таласе", " в Токтогуле", "в Джалал-абаде", "в Араване",
                "в Араване","");

        final QuestionsList question9=new QuestionsList(  "Где находится Токтогульский ГЭС",
                "Токтогуле", "Ош", "Бишкек", "Беловодский",
                "Токтогуле","");

        final QuestionsList question10=new QuestionsList(  "Каган Енисейский  Кыргызов?",
                "Бумин каган", "Темучин", "Чингисхан", "Барсбек каган",
                "Барсбек каган","");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        Collections.shuffle(questionsList);
        return questionsList;
    }

    private static List<QuestionsList> globusQuestions(){

        final List<QuestionsList> questionsList=new ArrayList<>();
        final QuestionsList question1=new QuestionsList("Какая страна является самой крупной по территории в мире?",
                "США", "Китай", "Россия", "Канада",
                "Россия","");

        final QuestionsList question2=new QuestionsList("В каком океане расположены Галапагосские острова?",
                "Тихий океан", "Атлантический океан", "Индийский океан", "Северный Ледовитый океан",
                "Тихий океан","");

        final QuestionsList question3=new QuestionsList(  "Какая из перечисленных стран НЕ граничит с Россией?",
                "Польша", "Иран", "Норвегия", "Япония",
                "Польша","");

        final QuestionsList question4=new QuestionsList(  "Какое из этих местоположений является наименее возвышенным на земном шаре?",
                "Мертвое море", "Байкал", "Долина смерти", "Каспийское море",
                "Долина смерти","");

        final QuestionsList question5=new QuestionsList(  "Какая страна занимает большую часть Апеннинского полуострова?",
                "Греция", "Италия", "Испания", "Франция италия",
                "Италия","");

        final QuestionsList question6=new QuestionsList(  "Какая самая высокая гора в мире?\n" +
                "a) Эверест\n" +
                "b) Килиманджаро\n" +
                "c) Аконкагуа\n" +
                "d) К2\n" +
                "Правильный ответ: a) Эверест",
                "Ош", "Токтогул", "Джалал-абад", "Москве",
                "Ош","");

        final QuestionsList question7=new QuestionsList(  "В каком городе находится Червонная площадь?",
                "Париж", "Берлин", "Москва", "Рим",
                "Москва","");

        final QuestionsList question8=new QuestionsList(  "Какое море омывает побережье Греции?",
                "Черное море", " Адриатическое море", "Эгейское море", " Средиземное море",
                "Эгейское море","");

        final QuestionsList question9=new QuestionsList(  "Какое из этих государств находится в Южной Америке?",
                "Нигерия", "Венесуэла", "Индонезия", "Иран",
                "ВенесуэлаС","");

        final QuestionsList question10=new QuestionsList(  "Столица Кыргызстана?",
                "Бишкек", "ОШ", "Талас", "Нарын",
                "Бишкек","");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList;
    }

    private static List<QuestionsList> sportQuestions(){

        final List<QuestionsList> questionsList=new ArrayList<>();
        final QuestionsList question1=new QuestionsList("В каком году были первые современные Олимпийские игры?",
                "1864", "1896", "1908", "1924",
                "1896","");

        final QuestionsList question2=new QuestionsList("Какая из этих игр не является олимпийским видом спорта?",
                "Футбол", "Гольф", "Теннис", "Бильярд",
                "Бильярд","");

        final QuestionsList question3=new QuestionsList(  "Какое из этих животных является символом Олимпийских игр?",
                "Слон", "Лев", "Орел", "Панда",
                "Орел","");

        final QuestionsList question4=new QuestionsList(  "В каком виде спорта используется шахматная доска?",
                "Шахматы", "Баскетбол", "Футбол", "Хоккей",
                "Шахматы","");

        final QuestionsList question5=new QuestionsList(  "Как называется самая высшая точка горы в альпинизме?",
                "Пикинг", "Вершина", "Пик", "Зенит",
                "Пик","");

        final QuestionsList question6=new QuestionsList(  "Какой из этих видов спорта не включает использование мяча?",
                "Бейсбол", "Гандбол", "Плавание", "Теннис",
                "Плавание","");

        final QuestionsList question7=new QuestionsList(  "Какой спортивный инвентарь используется в легкой атлетике для прыжка в высоту?",
                "Мяч", "Шар", "Шест", "Трамплин",
                "Шест","");

        final QuestionsList question8=new QuestionsList(  "Как называется турнир по борьбе среди профессионалов?",
                "Греко-римская борьба", "d2", "UFC", "Каратэ",
                "UFC","");

        final QuestionsList question9=new QuestionsList(  "Какой спортсмен получил прозвище Месси?",
                "Лионель Месси", "Криштиану Роналду", "Роналдо Назарио", "Неймар",
                "Лионель Месси","");

        final QuestionsList question10=new QuestionsList(  "Какой город был хозяином Олимпийских игр 2016 года?",
                "Токио", "Лондон", "Рио-де-Жанейро", "Пекин",
                "Рио-де-Жанейро","");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList;
    }

    private static List<QuestionsList> javaQuestions(){

        final List<QuestionsList> questionsList=new ArrayList<>();
        final QuestionsList question1=new QuestionsList("Какая версия Java была выпущена после Java 8?",
                "Java 9", "Java 10", "Java 11", "Java 12",
                "Java 11","");

        final QuestionsList question2=new QuestionsList("Какое ключевое слово используется для создания экземпляра класса в Java?",
                "new", "class", "instance", "create",
                "new","");

        final QuestionsList question3=new QuestionsList(  "Какая структура данных используется для хранения элементов в порядке \"последним пришёл, первым ушёл",
                "Стек (Stack)", "Очередь (Queue)",
                "Массив (Array)", "Список (List)",
                "Стек (Stack)","");

        final QuestionsList question4=new QuestionsList(  "Как объявить массив целых чисел в Java?",
                "int[] array;", "array<int> array;", "array[] int;", "array<int>[];",
                "int[] array;","");

        final QuestionsList question5=new QuestionsList(  "Что делает ключевое слово static перед методом в Java?",
                "Отмечает метод как приватный", "Делает метод доступным только внутри класса",
                "Позволяет вызывать метод без создания экземпляра класса", "Запрещает переопределение метода",
                "Позволяет вызывать метод без создания экземпляра класса","");

        final QuestionsList question6=new QuestionsList(  "Какой интерфейс используется для реализации простого цикла for-each в Java?",
                "Iterable", "Iterator",
                "ForEachable", "Enumerator",
                "Iterable","");

        final QuestionsList question7=new QuestionsList(  "Какие типы исключений обязательно нужно либо обработать, либо указать в сигнатуре метода?",
                "Checked Exceptions", "Unchecked Exceptions",
                " RuntimeExceptions", "All Exceptions",
                "Checked Exceptions","");

        final QuestionsList question8=new QuestionsList(  "Что такое JDK в контексте Java?",
                "Java Deployment Kit", " Java Development Kit",
                "Java Debugging Kit", "Java Database Kit",
                "Java Development Kit","");

        final QuestionsList question9=new QuestionsList(  "Какие методы имеет каждый Java-объект?",
                "wait(), notify(), notifyAll()", "start(), run(), stop()",
                "wait(), execute(), finish()", " begin(), pause(), resume()",
                "wait(), notify(), notifyAll()","");

        final QuestionsList question10=new QuestionsList(  "Какой тип доступа имеют переменные и методы в интерфейсе по умолчанию?",
                "public", "protected", "private", "default",
                "default","");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList;
    }

    private static List<QuestionsList> usaQuestions(){

        final List<QuestionsList> questionsList=new ArrayList<>();
        final QuestionsList question1=new QuestionsList("Какая столица США?",
                "Нью-Йорк\n", "Вашингтон", "Лос-Анджелес", "Чикаго",
                "Вашингтон","");

        final QuestionsList question2=new QuestionsList("Какой штат известен как Солнечное государство?",
            "Флорида", "Калифорния", "Техас", "Аризона",
                "Флорида","");

        final QuestionsList question3=new QuestionsList("В каком городе находится знаменитая статуя Свободы?",
                "Нью-Йорк", "Вашингтон",
                "Бостон", "Филадельфия",
                "Нью-Йорк","");

        final QuestionsList question4=new QuestionsList("Как называется национальный парк, расположенный в " +
                "штате Вайоминг и широко известный своими геотермальными и геизерными явлениями?",
                "Йеллоустоун", "Гранд Каньон", "Еловые острова", "Большой Каньон",
                "Йеллоустоун","");

        final QuestionsList question5=new QuestionsList("Какое озеро является самым крупным по площади в США?",
                "Озеро Супериор", "Озеро Мичиган","Озеро Верхнее", "Озеро Онтарио",
                "Озеро Супериор","");

        final QuestionsList question6=new QuestionsList("В каком городе находится стена, разделяющая Восточный и Западный сегменты?",
                " Нью-Йорк", "Вашингтон",
                "Берлин", "Лондон",
                "Берлин","");

        final QuestionsList question7=new QuestionsList(  "Какой из перечисленных штатов находится в Западном регионе США?",
                "Флорида", "Джорджия",
                "Вайоминг", "Мэн",
                "Вайоминг","");

        final QuestionsList question8=new QuestionsList(  "Кто был первым президентом США?",
                "Джордж Вашингтон", "Томас Джефферсон",
                "Авраам Линкольн", "Джон Адамс",
                "Джордж Вашингтон","");

        final QuestionsList question9=new QuestionsList(  "Какой из перечисленных городов является столицей штата Калифорния?",
                "Лос-Анджелес", "Сан-Франциско(",
                "Сакраменто", "Сан-Хосе",
                "Сакраменто","");

        final QuestionsList question10=new QuestionsList(  "Какая река является самой длинной в США?",
                "Миссисипи", "Миссури", "Юкон", "Колорадо",
                "Миссисипи","");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList;
    }
    private static List<QuestionsList> basketQuestions(){

        final List<QuestionsList> questionsList=new ArrayList<>();
        final QuestionsList question1=new QuestionsList("Какой диаметр у стандартного баскетбольного кольца?",
                "35 дюймов","18 дюймов","24 дюйма", "15 дюймов",
                "24 дюйма","");

        final QuestionsList question2=new QuestionsList("Какое количество игроков находится на поле в команде в момент начала игры?",
                "5","6", "7","4",
                "5","");

        final QuestionsList question3=new QuestionsList("Сколько очков приносит успешное попадание с учётом правил игры в большинстве лиг?",
                "2","3","1", "4",
                "2","");

        final QuestionsList question4=new QuestionsList("Какой термин используется для " +
                "обозначения передачи мяча с одного игрока другому без сопровождающего движения ног?",
                " Дриблинг","Пас", "Перехват", "Защита",
                "Пас","");

        final QuestionsList question5=new QuestionsList("Как называется действие, когда игрок совершает " +
                "бросок в корзину, находясь на воздухе?",
                "Блок-шот","Загрузка","Слэм-данк", "Подбор",
                "Слэм-данк","");

        final QuestionsList question6=new QuestionsList("В какой стране был изобретён баскетбол?",
                "США", "Англия","Канада", "Греция",
                "США","");

        final QuestionsList question7=new QuestionsList("Как называется ситуация, когда обороняющий игрок блокирует бросок атакующего?",
                "Перехват","Подбор"," Блок-шот", "Пас",
                "Блок-шот","");

        final QuestionsList question8=new QuestionsList(  "Какой термин используется для обозначения действия" +
                ", когда игрок пробегает весь корт и забрасывает мяч в корзину?",
                "Лей-ап","Флоп", "Штрафной бросок", "Блиц",
                "Лей-ап","");

        final QuestionsList question9=new QuestionsList(  "Сколько часов длится обычный матч в Национальной Баскетбольной Ассоциации (НБА)?",
                "60 минут", "48 минут",
                "90 минут", "120 минут",
                "48 минут","");

        final QuestionsList question10=new QuestionsList(  "Как называется действие, когда игрок прерывает подачу соперника, перехватывая мяч?",
                "Блок-шот Перехват","Подбор", "Перехват", "Защита",
                "Перехват","");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList;
    }
    private static List<QuestionsList> footbalQuestions(){

        final List<QuestionsList> questionsList=new ArrayList<>();
        final QuestionsList question1=new QuestionsList("Сколько игроков находится на поле в футбольной команде?",
                "7", "11", "9", "10",
                "11","");

        final QuestionsList question2=new QuestionsList("Какая команда является рекордсменом по количеству побед в Лиге чемпионов УЕФА?",
                " FC Barcelona","Real Madrid", "Manchester United", "Bayern Munich",
                "Real Madrid","");

        final QuestionsList question3=new QuestionsList(  "Какая часть тела футболиста является запрещенной для использования во время игры?",
                "Голова","Нога", "Рука", "Грудь",
                "Рука","");

        final QuestionsList question4=new QuestionsList("Как называется игровое пространство, где проводятся футбольные матчи?",
                " Поле","Корт","Арена","Площадка",
                "Поле","");

        final QuestionsList question5=new QuestionsList(  "Какой обычно является продолжительность футбольного матча?",
                "45 минут","60 минут","75 минут","90 минут",
                "90 минут","");

        final QuestionsList question6=new QuestionsList(  "В каком году была основана Международная федерация футбольной ассоциации (FIFA)?",
                "1863","1904","1924","1948",
                "1863","");

        final QuestionsList question7=new QuestionsList(  "Какую позицию в футболе занимает игрок, который " +
                "находится между защитниками и нападающими?",
                "Нападающий","Вратарь"," Защитник","Полузащитник",
                "Полузащитник","");

        final QuestionsList question8=new QuestionsList(  "Как называется турнир, в котором соревнуются сборные разных стран?",
                "Лига наций","Чемпионат Европы",
                "Чемпионат Мира", "Кубок Америки",
                "Чемпионат Мира","");

        final QuestionsList question9=new QuestionsList(  "Какая страна выиграла первый Чемпионат Мира по футболу?",
                "Франция", "Бразилия","Уругвай", "Германия",
                "Уругвай","");

        final QuestionsList question10=new QuestionsList(  "За что вручается индивидуальная награда Золотой мяч",
                "Лучшему голкиперу","Лучшему защитнику","Лучшему нападающем","Лучшему футболисту года",
                "Лучшему футболисту года","");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList;
    }
    private static List<QuestionsList> cplusQuestions(){

        final List<QuestionsList> questionsList=new ArrayList<>();
        final QuestionsList question1=new QuestionsList("Какая функция используется для вывода текста на экран в C++?",
                "print()", "write()", "cout <<", "display()",
                "cout <<","");

        final QuestionsList question2=new QuestionsList("Как называется оператор, используемый для объявления переменной в C++?",
                "var", "let", "int", "declare",
                "int","");

        final QuestionsList question3=new QuestionsList(" Какая из перечисленных структур данных является динамической в C++?",
                "Массив","Очередь","Стек","Вектор",
                "Вектор","");

        final QuestionsList question4=new QuestionsList("Какой символ используется для комментирования строки в C++?",
                "//", "#","--","/*",
                "//","");

        final QuestionsList question5=new QuestionsList("Как называется оператор, используемый для проверки условий в C++?",
                "switch","if","for","while",
                "if","");

        final QuestionsList question6=new QuestionsList("Как называется функция, вызываемая автоматически при создании объекта в C++?",
                " init()","start()","begin()","constructor()",
                "Iterable","");

        final QuestionsList question7=new QuestionsList("Какой оператор используется для доступа к членам класса в C++?",
                ".","::","->","=>",
                ".","");

        final QuestionsList question8=new QuestionsList("Как называется ключевое слово, используемое для завершения блока кода в C++?",
                "end","stop","done","}",
                "}","");

        final QuestionsList question9=new QuestionsList("Как называется оператор, используемый для выделения памяти в C++?",
                "alloc","new","allocate","malloc",
                "new","");

        final QuestionsList question10=new QuestionsList(  "Как называется функция, вызываемая автоматически при уничтожении объекта в C++?",
                "destructor()"," finalize()","delete()","end()",
                "destructor()","");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        // Перемешиваем список
        Collections.shuffle(questionsList);

        return questionsList;
    }

    public static List<QuestionsList> getQuestions (String selectedTopicName){
        switch (selectedTopicName){
            case "kgz" :return kgzQuestions();
            case "globus" : return globusQuestions();
            case "sport" : return sportQuestions();
            case "java" : return javaQuestions();
            case "usa" : return usaQuestions();
            case "basket" : return basketQuestions();
            case "footbal" : return footbalQuestions();
            default: return cplusQuestions();
        }
    }
}
