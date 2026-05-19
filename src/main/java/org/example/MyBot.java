package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class MyBot extends TelegramLongPollingBot {

    MyBotService myBotService = new MyBotService();
    int phtoNum = 13;

    @Override
    public void onUpdateReceived(Update update) {

        if(update.hasMessage() && update.getMessage().hasText()) {

            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();



            if(text.equals("/start")){
                try {
                    execute(myBotService.Start(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId = callbackQuery.getMessage().getChatId();
            Integer messageId = callbackQuery.getMessage().getMessageId();
            System.out.println(data);

            if(data.equals("InternetdanModelTopishId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText(" shu saytlardan model topishingiz mumkun:\n" +
                        "                https://www.printables.com/\n" +
                        "                https://www.thingiverse.com/");

                editMessageText.setReplyMarkup(myBotService.OrtgaQaeytargich(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if(data.equals("OrtgaId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText(" Assalomu alaykum!\n" +
                        "tanlangan faylini @AbrorbekBurxonov159 ga jonating\uD83E\uDDF1;\n" +
                        "⚙\uFE0F3d Printerda narsalar chiqarishni Boshlang⚙\uFE0F");

                editMessageText.setReplyMarkup(myBotService.StarterInline(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if(data.equals("OldingiSahifaId")){
                DeleteMessage  deleteMessage = new DeleteMessage();
                deleteMessage.setChatId(chatId);
                deleteMessage.setMessageId(messageId);

                try {
                    execute(deleteMessage);
                    execute(myBotService.Start(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if(data.equals("narxlarId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("""
                        Narxlanish quydagicha boladi :
                        PLA oddiy rangli filoment(plastik) [1gramm - 700 sum]: oddiy holatda ishlatilaydigan modellar , oyinchoqlar uchun togri keladi \n 
                        TPU filoment(plastik) [1gramm - 800 sum]: yumshoq , rezina xossalariga ega bolgan plastik , qattiq bolmagam jismlar uchun ishlatilinadi \n
                        ABS filomet(plastik) [1gramm - 900 sum]:PLA ga qaraganda mustqakamroq plastik turi
                        """);
                editMessageText.setReplyMarkup(myBotService.OrtgaQaeytargich(chatId));
                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }

            if(data.equals("chiqarishShartlariId")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("""
                        Printer platformasininig razmerlari 220mm X 220mm tashkil etadi;\n
                        Printer balandligi 270mm tashkil etadi;\n
                        tanlangan modellar shu razmerlarga mos kelish kerak , agar tolliq model kerak bolsa modelni bolib chiqarish hizmati bor
                        """);

                editMessageText.setReplyMarkup(myBotService.ShartlarInline(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if(data.equals("AloqaId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("Boglanish uchun: @AbrorbekBurxonov159");
                editMessageText.setReplyMarkup(myBotService.OrtgaQaeytargich(chatId));

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if(data.equals("ChiqarilganProektalarId")) {

                EditMessageMedia editMessageMedia = new EditMessageMedia();
                editMessageMedia.setChatId(chatId);
                editMessageMedia.setMessageId(messageId);
                editMessageMedia.setMedia(new InputMediaPhoto("https://t.me/ImageBaze/" + phtoNum + ""));

                editMessageMedia.setReplyMarkup(myBotService.PhotoInline());

                try {
                    execute(editMessageMedia);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if(data.equals("KeyingiId")){
                if(phtoNum < 20){
                    phtoNum = phtoNum+1;
                    EditMessageMedia editMessageMedia = new EditMessageMedia();
                    editMessageMedia.setChatId(chatId);
                    editMessageMedia.setMessageId(messageId);
                    editMessageMedia.setMedia(new InputMediaPhoto("https://t.me/ImageBaze/" + phtoNum + ""));
                    editMessageMedia.setReplyMarkup(myBotService.PhotoInline());
                    try {
                        execute(editMessageMedia);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(phtoNum);


            }
            if(data.equals("OldingiId")){
                if(phtoNum > 13){
                    phtoNum = phtoNum-1;
                    EditMessageMedia editMessageMedia = new EditMessageMedia();
                    editMessageMedia.setChatId(chatId);
                    editMessageMedia.setMessageId(messageId);
                    editMessageMedia.setMedia(new InputMediaPhoto("https://t.me/ImageBaze/" + phtoNum + ""));
                    editMessageMedia.setReplyMarkup(myBotService.PhotoInline());
                    try {
                        execute(editMessageMedia);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(phtoNum);
            }


            if(data.equals("ZakazgaModelId")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(messageId);
                editMessageText.setText("\uD83D\uDCD0 Zakazga model yasash\n" +
                        "\n" +
                        "Bu bo‘limda siz chizmalaringiz asosida 3D model buyurtma qilishingiz mumkin.\n" +
                        "Iltimos, quyidagilarni yodda tuting:\n" +
                        "\n" +
                        "Model juda murakkab bo‘lmasligi kerak.\n" +
                        "\n" +
                        "Siz taqdim qilgan chizma yoki rasm asosida model tayyorlanadi.\n" +
                        "\n" +
                        "tayyor modelni 3D bosib berilgan holatda, chop etilgan buyum narxiga +30% xizmat haqi qo‘shiladi.\n" +
                        "\n" +
                        "Buyurtma berish uchun model haqida qisqacha ma’lumot va chizmalarni yuboring.");
                editMessageText.setReplyMarkup(myBotService.OrtgaQaeytargich(chatId));



                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }




    @Override
    public String getBotUsername() {
        return "Uz3dPrinterXizmatlariBot";
    }

    @Override
    public String getBotToken() {
        return "8446024501:AAEMPqjf0ZF1FaZ5CwvEynoxLeenjecYxuk";
    }
}
