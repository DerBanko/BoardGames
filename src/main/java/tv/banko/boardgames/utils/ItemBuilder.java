package tv.banko.boardgames.utils;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionType;

import java.util.*;

public class ItemBuilder {

    private final ItemStack item;

    /**
     * Create an ItemBuilder with Material
     * @param material Material
     */
    public ItemBuilder(final Material material) {
        this(material, 1);
    }

    /**
     * Create an ItemBuilder with an ItemStack
     * @param item ItemStack
     */
    public ItemBuilder(final ItemStack item) {
        super();
        this.item = item;
    }

    /**
     * Create an ItemBuilder with Material and Amount
     * @param material Material
     * @param amount Amount
     */
    public ItemBuilder(final Material material, final int amount) {
        super();
        this.item = new ItemStack(material, amount);
    }

    /**
     * Set the Name of the ItemStack
     * @param name Name
     * @return ItemBuilder
     */
    public ItemBuilder setName(final String name) {
        final ItemMeta itemMeta = getItemMeta();
        itemMeta.setDisplayName(name);
        this.item.setItemMeta(itemMeta);
        return this;
    }

    /**
     * Set the Amount of the ItemStack
     * @param amount Amount
     * @return ItemBuilder
     */
    public ItemBuilder setAmount(final int amount) {
        this.item.setAmount(amount);
        return this;
    }

    /**
     * Set the ItemStack unbreakable
     * @param unbreakable Unbreakable
     * @return ItemStack
     */
    public ItemBuilder setUnbreakable(final boolean unbreakable) {
        final ItemMeta itemMeta = getItemMeta();
        itemMeta.setUnbreakable(unbreakable);
        this.item.setItemMeta(itemMeta);
        return this;
    }

    /**
     * Add an Enchantment to the ItemStack
     * @param enchantment Enchantment
     * @param level Level
     * @return ItemBuilder
     */
    public ItemBuilder addEnchant(final Enchantment enchantment, final int level) {
        final ItemMeta itemMeta = getItemMeta();
        itemMeta.addEnchant(enchantment, level, true);
        this.item.setItemMeta(itemMeta);
        return this;
    }

    /**
     * Add an unsafe Enchantment to the ItemStack
     * @param enchantment Enchantment
     * @param level Level
     * @return ItemBuilder
     */
    public ItemBuilder addUnsafeEnchantment(final Enchantment enchantment, final int level) {
        this.item.addUnsafeEnchantment(enchantment, level);
        return this;
    }

    /**
     * Add Enchantments to the ItemStack
     * @param enchantments Enchantments
     * @return ItemBuilder
     */
    public ItemBuilder addEnchantments(final Map<Enchantment, Integer> enchantments) {
        this.item.addEnchantments(enchantments);
        return this;
    }

    /**
     * Remove an Enchantment from the ItemStack
     * @param enchantment Enchantment
     * @return ItemBuilder
     */
    public ItemBuilder removeEnchantment(final Enchantment enchantment) {
        this.item.removeEnchantment(enchantment);
        return this;
    }

    /**
     * Set the Lores to the ItemStack with a String Array
     * @param lines Lores
     * @return ItemBuilder
     */
    public ItemBuilder setLore(final String... lines) {
        final ItemMeta itemMeta = getItemMeta();
        itemMeta.setLore(Arrays.asList(lines));
        this.item.setItemMeta(itemMeta);
        return this;
    }

    /**
     * Set the Lores to the ItemStack with a List
     * @param lines Lores
     * @return ItemBuilder
     */
    public ItemBuilder setLore(final List<String> lines) {
        final ItemMeta itemMeta = getItemMeta();
        itemMeta.setLore(lines);
        this.item.setItemMeta(itemMeta);
        return this;
    }

    /**
     * Remove Lore from the ItemStack with the Content
     * @param line Lore
     * @return ItemBuilder
     */
    public ItemBuilder removeLoreLine(final String line) {
        final ItemMeta itemMeta = getItemMeta();
        final List<String> lores;

        if (itemMeta.getLore() == null) {
            lores = new ArrayList<>();
        } else {
            lores = new ArrayList<>(itemMeta.getLore());
        }

        if (!lores.contains(line)) {
            return this;
        }

        lores.remove(line);
        itemMeta.setLore(lores);
        this.item.setItemMeta(itemMeta);
        return this;
    }

    /**
     * Remove Lore from the ItemStack with the Index
     * @param index Index
     * @return ItemBuilder
     */
    public ItemBuilder removeLoreLine(final int index) {
        final ItemMeta itemMeta = getItemMeta();
        final List<String> lores;

        if (itemMeta.getLore() == null) {
            lores = new ArrayList<>();
        } else {
            lores = new ArrayList<>(itemMeta.getLore());
        }

        if (index < 0 || index > lores.size()) {
            return this;
        }

        lores.remove(index);
        itemMeta.setLore(lores);
        this.item.setItemMeta(itemMeta);
        return this;
    }

    /**
     * Add Lore to the ItemStack
     * @param line Lore
     * @return ItemBuilder
     */
    public ItemBuilder addLoreLine(final String line) {
        final ItemMeta itemMeta = getItemMeta();
        final List<String> lores;

        if (itemMeta.getLore() == null) {
            lores = new ArrayList<>();
        } else {
            lores = new ArrayList<>(itemMeta.getLore());
        }

        lores.add(line);

        itemMeta.setLore(lores);
        this.item.setItemMeta(itemMeta);
        return this;
    }

    /**
     * Add Lores to the ItemStack
     * @param lines Lores
     * @return ItemBuilder
     */
    public ItemBuilder addLoreLines(final String... lines) {
        final ItemMeta itemMeta = getItemMeta();
        final List<String> lores;

        if (itemMeta.getLore() == null) {
            lores = new ArrayList<>();
        } else {
            lores = new ArrayList<>(itemMeta.getLore());
        }

        lores.addAll(Arrays.asList(lines));

        itemMeta.setLore(lores);
        this.item.setItemMeta(itemMeta);
        return this;
    }

    /**
     * Set a Lore to a specific line
     * @param line Lore
     * @param position Position in Lores
     * @return ItemBuilder
     */
    public ItemBuilder setLoreLine(final String line, final int position) {
        final ItemMeta itemMeta = getItemMeta();
        final List<String> lores;

        if (itemMeta.getLore() == null) {
            lores = new ArrayList<>();
        } else {
            lores = new ArrayList<>(itemMeta.getLore());
        }

        lores.set(position, line);
        itemMeta.setLore(lores);
        this.item.setItemMeta(itemMeta);
        return this;
    }

    /**
     * Add ItemFlags to the ItemStack
     * @param flags ItemFlags
     * @return ItemBuilder
     */
    public ItemBuilder addItemFlags(final ItemFlag... flags) {
        final ItemMeta itemMeta = getItemMeta();
        itemMeta.addItemFlags(flags);
        this.item.setItemMeta(itemMeta);
        return this;
    }

    /**
     * Set the SkullOwner's Name of the Player Head
     * @deprecated prefer using UUID
     * @param owner Username
     * @return ItemBuilder
     */
    @Deprecated
    public ItemBuilder setSkullOwner(final String owner) {
        final ItemMeta itemMeta = getItemMeta();

        if (!(itemMeta instanceof SkullMeta)) {
            return this;
        }

        final SkullMeta skullMeta = (SkullMeta) itemMeta;
        skullMeta.setOwningPlayer(Bukkit.getOfflinePlayer(owner));
        this.item.setItemMeta(skullMeta);
        return this;
    }

    /**
     * Set the SkullOwner's UUID of the Player Head
     * @param uuid UUID
     * @return ItemBuilder
     */
    public ItemBuilder setSkullOwner(final UUID uuid) {
        final ItemMeta itemMeta = getItemMeta();

        if (!(itemMeta instanceof SkullMeta)) {
            return this;
        }

        final SkullMeta skullMeta = (SkullMeta) itemMeta;
        skullMeta.setOwningPlayer(Bukkit.getOfflinePlayer(uuid));
        this.item.setItemMeta(skullMeta);
        return this;
    }

    /**
     * Set the Color of the Leather Armor
     * @param color Color
     * @return ItemBuilder
     */
    public ItemBuilder setLeatherArmorColor(final Color color) {
        final ItemMeta itemMeta = getItemMeta();

        if (!(itemMeta instanceof LeatherArmorMeta)) {
            return this;
        }

        final LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemMeta;
        leatherArmorMeta.setColor(color);
        this.item.setItemMeta(leatherArmorMeta);
        return this;
    }

    /**
     * Set the BasePotionData of the Potion
     * @param potionType PotionType
     * @return ItemBuilder
     */
    public ItemBuilder setBasePotionData(final PotionType potionType) {
        final ItemMeta itemMeta = getItemMeta();

        if (!(itemMeta instanceof PotionMeta)) {
            return this;
        }

        final PotionMeta potionMeta = (PotionMeta) itemMeta;
        potionMeta.setBasePotionData(new PotionData(potionType));
        this.item.setItemMeta(potionMeta);
        return this;
    }

    /**
     * Add a CustomPotionEffect to the Potion
     * @param potionEffect PotionEffect
     * @return ItemBuilder
     */
    public ItemBuilder addCustomPotionEffect(final PotionEffect potionEffect) {
        final ItemMeta itemMeta = getItemMeta();

        if (!(itemMeta instanceof PotionMeta)) {
            return this;
        }

        final PotionMeta potionMeta = (PotionMeta) itemMeta;
        potionMeta.addCustomEffect(potionEffect, true);
        this.item.setItemMeta(potionMeta);
        return this;
    }

    /**
     * Set the Color of the Potion
     * @param color PotionColor
     * @return ItemBuilder
     */
    public ItemBuilder setPotionColor(final Color color) {
        final ItemMeta itemMeta = getItemMeta();

        if (!(itemMeta instanceof PotionMeta)) {
            return this;
        }

        final PotionMeta potionMeta = (PotionMeta) itemMeta;
        potionMeta.setColor(color);
        this.item.setItemMeta(potionMeta);
        return this;
    }

    /**
     * Build the ItemStack
     * @return ItemStack
     */
    public ItemStack toItemStack() {
        return this.item;
    }

    /**
     * Clone the ItemBuilder
     *
     * @return ItemBuilder
     */
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get the ItemMeta of the ItemStack
     * @return ItemMeta
     */
    private ItemMeta getItemMeta() {

        if (item.getItemMeta() == null) {
            item.setItemMeta(Bukkit.getItemFactory().getItemMeta(item.getType()));
        }

        return item.getItemMeta();
    }
}