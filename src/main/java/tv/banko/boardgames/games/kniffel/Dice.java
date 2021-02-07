package tv.banko.boardgames.games.kniffel;

import org.bukkit.inventory.ItemStack;
import tv.banko.boardgames.language.Language;
import tv.banko.boardgames.utils.ItemBuilder;
import tv.banko.boardgames.utils.SkullCreator;

public class Dice {

    // Normal Dice ItemStacks
    private ItemStack whiteOne, whiteTwo, whiteThree, whiteFour, whiteFive, whiteSix;

    // Selected Dice ItemStacks
    private ItemStack grayOne, grayTwo, grayThree, grayFour, grayFive, graySix;

    // ItemStacks of Dices which have an impact on the task
    private ItemStack goldenOne, goldenTwo, goldenThree, goldenFour, goldenFive, goldenSix;

    public Dice() {
        generateWhiteOne();
        generateWhiteTwo();
        generateWhiteThree();
        generateWhiteFour();
        generateWhiteFive();
        generateWhiteSix();

        generateGrayOne();
        generateGrayTwo();
        generateGrayThree();
        generateGrayFour();
        generateGrayFive();
        generateGraySix();

        generateGoldenOne();
        generateGoldenTwo();
        generateGoldenThree();
        generateGoldenFour();
        generateGoldenFive();
        generateGoldenSix();
    }

    public final ItemStack getWhiteOne() {
        return whiteOne;
    }

    public final ItemStack getWhiteTwo() {
        return whiteTwo;
    }

    public final ItemStack getWhiteThree() {
        return whiteThree;
    }

    public final ItemStack getWhiteFour() {
        return whiteFour;
    }

    public final ItemStack getWhiteFive() {
        return whiteFive;
    }

    public final ItemStack getWhiteSix() {
        return whiteSix;
    }

    public final ItemStack getGrayOne() {
        return grayOne;
    }

    public final ItemStack getGrayTwo() {
        return grayTwo;
    }

    public final ItemStack getGrayThree() {
        return grayThree;
    }

    public final ItemStack getGrayFour() {
        return grayFour;
    }

    public final ItemStack getGrayFive() {
        return grayFive;
    }

    public final ItemStack getGraySix() {
        return graySix;
    }

    public final ItemStack getGoldenOne() {
        return goldenOne;
    }

    public final ItemStack getGoldenTwo() {
        return goldenTwo;
    }

    public final ItemStack getGoldenThree() {
        return goldenThree;
    }

    public final ItemStack getGoldenFour() {
        return goldenFour;
    }

    public final ItemStack getGoldenFive() {
        return goldenFive;
    }

    public final ItemStack getGoldenSix() {
        return goldenSix;
    }

    private void generateWhiteOne() {
        whiteOne = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2E1MTZmYmFlMTYwNThmMjUxYWVmOWE2OGQzMDc4NTQ5ZjQ4ZjZkNWI2ODNmMTljZjVhMTc0NTIxN2Q3MmNjIn19fQ=="))
                .setName("§f1")
                .toItemStack();
    }

    private void generateWhiteTwo() {
        whiteTwo = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDY5OGFkZDM5Y2Y5ZTRlYTkyZDQyZmFkZWZkZWMzYmU4YTdkYWZhMTFmYjM1OWRlNzUyZTlmNTRhZWNlZGM5YSJ9fX0="))
                .setName("§f2")
                .toItemStack();
    }

    private void generateWhiteThree() {
        whiteThree = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmQ5ZTRjZDVlMWI5ZjNjOGQ2Y2E1YTFiZjQ1ZDg2ZWRkMWQ1MWU1MzVkYmY4NTVmZTlkMmY1ZDRjZmZjZDIifX19"))
                .setName("§f3")
                .toItemStack();
    }

    private void generateWhiteFour() {
        whiteFour = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjJhM2Q1Mzg5ODE0MWM1OGQ1YWNiY2ZjODc0NjlhODdkNDhjNWMxZmM4MmZiNGU3MmY3MDE1YTM2NDgwNTgifX19"))
                .setName("§f4")
                .toItemStack();
    }

    private void generateWhiteFive() {
        whiteFive = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDFmZTM2YzQxMDQyNDdjODdlYmZkMzU4YWU2Y2E3ODA5YjYxYWZmZDYyNDVmYTk4NDA2OTI3NWQxY2JhNzYzIn19fQ=="))
                .setName("§f5")
                .toItemStack();
    }

    private void generateWhiteSix() {
        whiteSix = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2FiNGRhMjM1OGI3YjBlODk4MGQwM2JkYjY0Mzk5ZWZiNDQxODc2M2FhZjg5YWZiMDQzNDUzNTYzN2YwYTEifX19"))
                .setName("§f6")
                .toItemStack();
    }

    private void generateGrayOne() {
        grayOne = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmY2MTI2OTczNWYxZTQ0NmJlY2ZmMjVmOWNiM2M4MjM2Nzk3MTlhMTVmN2YwZmJjOWEwMzkxMWE2OTJiZGQifX19"))
                .setName("§f1 §8(§7" + Language.CHOSEN + "§8)")
                .addLoreLine("")
                .addLoreLine(" §7§o" + Language.CHOSEN_DICE_EXPLANATION + ".")
                .addLoreLine("")
                .toItemStack();
    }

    private void generateGrayTwo() {
        grayTwo = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2Q4MWEzMmQ5NzhmOTMzZGViN2VhMjZhYTMyNmU0MTc0Njk3NTk1YTQyNmVhYTlmMmFlNWY5YzJlNjYxMjkwIn19fQ=="))
                .setName("§f2 §8(§7" + Language.CHOSEN + "§8)")
                .addLoreLine("")
                .addLoreLine(" §7§o" + Language.CHOSEN_DICE_EXPLANATION + ".")
                .addLoreLine("")
                .toItemStack();
    }

    private void generateGrayThree() {
        grayThree = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2VhZGFkZWQ4MTU2M2YxYzg3NzY5ZDZjMDQ2ODlkY2RiOWU4Y2EwMWRhMzUyODFjZDhmZTI1MTcyOGQyZCJ9fX0="))
                .setName("§f3 §8(§7" + Language.CHOSEN + "§8)")
                .addLoreLine("")
                .addLoreLine(" §7§o" + Language.CHOSEN_DICE_EXPLANATION + ".")
                .addLoreLine("")
                .toItemStack();
    }

    private void generateGrayFour() {
        grayFour = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmM2MDhjMmRiNTI1ZDZkNzdmN2RlNGI5NjFkNjdlNTNlOWQ3YmFjZGFmZjMxZDRjYTEwZmJiZjkyZDY2In19fQ=="))
                .setName("§f4 §8(§7" + Language.CHOSEN + "§8)")
                .addLoreLine("")
                .addLoreLine(" §7§o" + Language.CHOSEN_DICE_EXPLANATION + ".")
                .addLoreLine("")
                .toItemStack();
    }

    private void generateGrayFive() {
        grayFive = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTE0NGM1MTkzNDM1MTk5YzEzNWJkNDdkMTY2ZWYxYjRlMmQzMjE4MzgzZGY5ZDM0ZTNiYjIwZDlmOGU1OTMifX19"))
                .setName("§f5 §8(§7" + Language.CHOSEN + "§8)")
                .addLoreLine("")
                .addLoreLine(" §7§o" + Language.CHOSEN_DICE_EXPLANATION + ".")
                .addLoreLine("")
                .toItemStack();
    }

    private void generateGraySix() {
        graySix = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjYxZjdlMzg1NTY4NTZlYWU1NTY2ZWYxYzQ0YThjYzY0YWY4ZjNhNTgxNjJiMWRkODAxNmE4Nzc4YzcxYyJ9fX0="))
                .setName("§f6 §8(§7" + Language.CHOSEN + "§8)")
                .addLoreLine("")
                .addLoreLine(" §7§o" + Language.CHOSEN_DICE_EXPLANATION + ".")
                .addLoreLine("")
                .toItemStack();
    }

    private void generateGoldenOne() {
        goldenOne = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDU1ZmMyYzFiYWU4ZTA4ZDNlNDI2YzE3YzQ1NWQyZmY5MzQyMjg2ZGZmYTNjN2MyM2Y0YmQzNjVlMGMzZmUifX19"))
                .setName("§61")
                .addLoreLine("")
                .addLoreLine(" §7§o" + Language.DICE_IMPACT_ON_RATING + ".")
                .addLoreLine("")
                .toItemStack();
    }

    private void generateGoldenTwo() {
        goldenTwo = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM2MWIwNGUxMmE4Nzk3NjdiM2I3MmQ2OTYyN2YyOWE4M2JkZWI2MjIwZjVkYzdiZWEyZWIyNTI5ZDViMDk3In19fQ=="))
                .setName("§62")
                .addLoreLine("")
                .addLoreLine(" §7§o" + Language.DICE_IMPACT_ON_RATING + ".")
                .addLoreLine("")
                .toItemStack();
    }

    private void generateGoldenThree() {
        goldenThree = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjgyM2Y3NzU1OGNhNjA2MGI2ZGM2YTRkNGIxZDg2YzFhNWJlZTcwODE2NzdiYmMzMzZjY2I5MmZiZDNlZSJ9fX0="))
                .setName("§63")
                .addLoreLine("")
                .addLoreLine(" §7§o" + Language.DICE_IMPACT_ON_RATING + ".")
                .addLoreLine("")
                .toItemStack();
    }

    private void generateGoldenFour() {
        goldenFour = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTFiOWM0ZDZmNzIwOGIxNDI0Zjg1OTViZmMxYjg1Y2NhYWVlMmM1YjliNDFlMGY1NjRkNGUwYWNhOTU5In19fQ=="))
                .setName("§64")
                .addLoreLine("")
                .addLoreLine(" §7§o" + Language.DICE_IMPACT_ON_RATING + ".")
                .addLoreLine("")
                .toItemStack();
    }

    private void generateGoldenFive() {
        goldenFive = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmMxNDE1OTczYjQyZjgyODZmOTQ4ZTIxNDA5OTJiOWEyOWQ4MDk2NTU5M2IxNDU1M2Q2NDRmNGZlYWZiNyJ9fX0="))
                .setName("§65")
                .addLoreLine("")
                .addLoreLine(" §7§o" + Language.DICE_IMPACT_ON_RATING + ".")
                .addLoreLine("")
                .toItemStack();
    }

    private void generateGoldenSix() {
        goldenSix = new ItemBuilder(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTZmNWZiZmJjODk0NGE1MDc3NzExMzc5OGU5ZmUzYWVhYzJlMzk2NDg5NDdiNzBjYzEwM2RlYjZjOWU4NjYxIn19fQ=="))
                .setName("§66")
                .addLoreLine("")
                .addLoreLine(" §7§o" + Language.DICE_IMPACT_ON_RATING + ".")
                .addLoreLine("")
                .toItemStack();
    }

}
