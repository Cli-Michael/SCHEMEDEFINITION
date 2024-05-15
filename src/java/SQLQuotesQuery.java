/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class SQLQuotesQuery {
    public static void main(String[] args) {
        String input = "Region,Division,SchemeLetterReceivedDate,SchemeLetterReceivedTime,SchemeLetterName,SchemeType,Component,SchemeID,AdditionalRequirementDetails,RequestDate,ChangesDate,DifferentRequirementFromUnit,DefineBy,ReasonForNotDefine,Status,DefineTime,StartTime,EndTime,Ageing,Day,SchemeDate,Days,TAT,SchemeDeployed,Checker1Date,Checker1Name,Error,Error_,Solved,ErrorHighlightedByRegion,RegionName,ErrorAccepted,ErrorDescription,HighlightedByOfficerName,HighlightedDate,Rectified,RectificationDate,ResolvingTime";
        String[] elements = input.split(",");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < elements.length; i++) {
            output.append('"').append(elements[i]).append('"');
            if (i != elements.length - 1) {
                output.append(",");
            }
        }

        System.out.println(output.toString());
    }
}
