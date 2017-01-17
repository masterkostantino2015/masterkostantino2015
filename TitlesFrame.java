/*
 * Декомпилированы с ЧФР 0_118.
 */
импорт ява.авт.Компонентов;
импорт пакета javax.качели.Форму;
импорт пакета javax.качели.Метода swingutilities;

общественный класс TitlesFrame
расширяет форму jframe {
    общественные TitlesFrame() {
        это.initUI();
    }

    частный аннулировать initUI() {
        это.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        это.setDefaultCloseOperation(3);
        это.добавить(новый TitlesPanel(78));
        это.метод setsize(350, 350);
        это.setLocationRelativeTo(значение NULL);
    }

    публичный статический пустота главный(строка[] аргументы) {
        метода swingutilities.invokeLater(новый интерфейс runnable(){

            @Переопределить
            публичного недействительными запустить() {
                TitlesFrame ПС = новый TitlesFrame();
 ПС.функцию setvisible(истина);
            }
        });
    }

}
