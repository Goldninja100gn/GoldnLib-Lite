# GoldnLib-Lite
GoldnLib is a really useful mod to be used with Forge and Fabric modpacks, 
but due to it's nature of adding items and intergrated functions to the game, 
it doesn't work well with Vanilla. GoldnLib Lite fixes that.

This version of GoldnLib is stripped down to basic essential features using a command based system to avoid conflicts. 
This does result in many missing features that were loved in GoldnLib.

## Contribution
Unlike GoldnLib, GoldnLib Lite is open-sourced and compatible with popular mod editor MCreator. 
We welcome anyone to make PR to the mod to add in useful features that can work client-side-only. 

## What is Client-Only?
This mod is designed to work with servers that don't have the mod installed. 
This works by using commands to serve functionality. 
Several long commands that you would normally have to execute features can be simply shorten to a single command or keybind. 

Please note you still require the proper permission level. Currently that requires permission level 4 (Owner). 
I don't have enough knowledge on server permissions to be able to get commands/keybinds' permissions to match with in-game permissions. 
Example, if `minecraft.gamemode.creative` (allows a player to use `/gamemode creative`) is allowed for a non-level 4 player, 
the mod can't recongize that and will still not allow the player to use `/gmc`. 
I have an idea on how to fix that, but it makes the commands appear in the `/help` menu when they don't have permissions to use the command.

Some servers detect Fabric mods as cheats, this mod doesn't interact with the server outside of sending commands on your behalf, so it shouldn't be an issue.

## Redisbution and other legal stuff
We allow redisbution of this mod as long as credited back to Goldn's [Github repo](https://github.com/Goldninja100gn/GoldnLib-Lite), 
[CurseForge project](https://www.curseforge.com/members/goldninja100gn/projects), or [Website](https://goldn.dev). You can also modify this mod's files for personal use.
