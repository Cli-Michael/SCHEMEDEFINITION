/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        String input = "Region,Division,SchemeLetterReceivedDate,SchemeLetterReceivedTime,SchemeLetterName,SchemeType,Component,SchemeID,AdditionalRequirementDetails,RequestDate,ChangesDate,DifferentRequirementFromUnit,DefineBy,ReasonForNotDefine,Status,DefineTime,StartTime,EndTime,Ageing,Day,SchemeDate,Days,TAT,SchemeDeployed,Checker1Date,Checker1Name,Error,Error_,Solved,ErrorHighlightedByRegion,RegionName,ErrorAccepted,ErrorDescription,HighlightedByOfficerName,HighlightedDate,Rectified,RectificationDate,ResolvingTime";

        // Split the string into an array of substrings
        String[] fruits = input.split(",");

        // Loop through the array of substrings
        for (String fruit : fruits) {
            // Perform operations on each substring
            System.out.println("System.out.println("+fruit+");");
        }
    }
}
