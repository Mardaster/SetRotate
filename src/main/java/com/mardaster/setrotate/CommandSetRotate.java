package com.mardaster.setrotate;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommandSetRotate extends CommandBase {

    @Override
    public String getCommandName() {
        return "setrotate";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/setrotate <yaw> <pitch> (alias: /sr)";
    }

    @Override
    public List<String> getCommandAliases() {
        return Arrays.asList("sr");
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if (args.length != 2) {
            throw new WrongUsageException(getCommandUsage(sender));
        }

        float yaw;
        float pitch;

        try {
            yaw = Float.parseFloat(args[0]);
            pitch = Float.parseFloat(args[1]);
        } catch (NumberFormatException e) {
            throw new WrongUsageException("yaw and pitch must be numbers. " + getCommandUsage(sender));
        }

        if (pitch > 90f) pitch = 90f;
        if (pitch < -90f) pitch = -90f;

        Minecraft mc = Minecraft.getMinecraft();
        if (mc.thePlayer == null) {
            sender.addChatMessage(new ChatComponentText("§cError: player not found."));
            return;
        }

        mc.thePlayer.rotationYaw = yaw;
        mc.thePlayer.rotationPitch = pitch;

        sender.addChatMessage(new ChatComponentText("§aRotation set: yaw=" + yaw + ", pitch=" + pitch));
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        return Collections.emptyList();
    }
}
