# GoldnLib-Lite
GoldnLib is a really useful mod to be used with Forge and Fabric modpacks, 
but due to it's nature of adding items and intergrated functions to the game, 
it doesn't work well with Vanilla. GoldnLib Lite fixes that.

This version of GoldnLib is stripped down to basic essential features using a command based system to avoid conflicts. 
This does result in many missing features that were loved in GoldnLib.

## Contribution
Unlike GoldnLib, GoldnLib Lite is open-sourced and compatible with popular mod editor MCreator. 
We welcome anyone to make PR to the mod to add in useful features that can work client-side-only. 

If you contribute to this mod, you can add your username to [fabric.mod.json.txt](/fabric.mod.json.txt) file. 
This file contains a copy-pasta for the mod when exported. At the bottom of the file explains how to use it. If you have questions, contact Goldn.

## What is Client-Only?
This mod is designed to work with servers that don't have the mod installed. 
This works by using commands to serve functionality. 
Several long commands that you would normally have to execute features can be simply shorten to a single command or keybind. 

All functionally still requires the proper permissions or [Permission Level](https://minecraft.fandom.com/wiki/Permission_level) 2 (by Default). 
+ The shortened gamemode commands require `minecraft.command.gamemode.{gamemode}` and/or `minecraft.command.gamemode`.
+ The heal and feed commands require `minecraft.command.effect`

Even if a player doesn't have the right permission level, the commands added by this mod will still appear in the help menu.

Some servers detect Fabric mods as cheats, this mod doesn't interact with the server outside of sending commands on your behalf, so it shouldn't be an issue.

## Redisbution and other legal stuff
We allow redisbution of this mod as long as credited back to Goldn's [Github repo](https://github.com/Goldninja100gn/GoldnLib-Lite), 
[CurseForge project](https://www.curseforge.com/members/goldninja100gn/projects), or [Website](https://goldn.dev). You can also modify this mod's files for personal use.
