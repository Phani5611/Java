package sortingAlgo;
import java.util.* ;
import java.io.*; 

public class solution {
//    public static int getSecondLargest(int n,int arr[]){
//      int largest=arr[0];
//         int secondLarge=-1;
//         for(int i=0;i<n;i++){
//         if(arr[i]>largest  ){
//             secondLarge=largest;
//             largest=arr[i];
//         }
//         else if(arr[i]<largest && arr[i]>secondLarge){
//             secondLarge=arr[i];
//         }
//         }
//         return secondLarge;
//     }
    public static int getSecondSmallest(int n,int arr[]){
        int smallest=arr[0] ;
        int secondSmallest=Integer.MAX_VALUE;  
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];JOB DESCRIPTION

                Associate Software Engineer (ASE)
                
                About Accenture
                Accenture is a global professional services company with leading capabilities in digital, cloud and security. Combining unmatched experience and specialized skills across more than 40 industries, we offer Strategy and Consulting, Interactive, Technology and Operations services-all powered by the world's largest network of Advanced Technology and Intelligent Operations centres. Our 624,000 people deliver on the promise of technology and human ingenuity every day, serving clients in more than 120 countries. We embrace the power of change to create value and shared success for our clients, people, shareholders, partners, and communities. Visit us at www.accenture.com.
                
                Role Overview
                Join our team that is developing, designing and maintaining technologies that improve the way our clients and the world works. Working in challenging and dynamic environments, using their versatility to create and support technology solutions that meet client requirements from analysis to implementation
                
                What would you do? 
                
                As an Associate Software Engineer you would largely be involved in:
                Design, build, test, assemble, support and configure application using business requirements
                Understand business drivers that will impact performance and deliver software to those expectations
                Bake technology trends into solutions; Participate in the development of automation solutions, new functionality and technologies and integrate them in existing solutions
                Responsible for incident resolution and support extended to customers through voice interaction/email/chat/remote support
                What we need?
                
                We would love you to have:
                Ability to anticipate and resolve business issues with agility
                Multi-disciplinary and versatile with the aptitude to learn and apply new skills faster
                Good analytical and problem-solving skills and proficient in verbal and communication skills
                Deliver code, to time and quality expectations and participate in peer reviews
                Take ownership of the successful implementation of the solution
                Support infrastructure operations and /or manage delivery for IT production system and services
                Flexibility to relocate for project deployment to any part of India and work in 24X7 shifts basis business requirement
                Also, the below mentioned will be preferred:
                Basic understanding of ABAP Development on HANA, CDS, AMDP, Performance Analysis
                Experience or knowledge in configuration, customization of Salesforce.com applications
                Good working knowledge in J2EE and full-stack development
                Knowledge and development experience of .NET (ASP.NET/ASP.NET MVC)
                Test automation engineering
                Creation of test designs, test processes, test cases and test data
                Apply business and functional knowledge including testing standards, guidelines, and testing methodology to meet the teams overall test objectives
                Responsible for designing testing scenarios for usability testing
                Prepare all reports related to software testing carried out
                Analyze the results and then submit the observations to the development team
                Eligibility Criteria:
                All streams/branches of B.E/B.Tech/M.E/M.Tech, MCA, and M.Sc. (CSE, IT only) from 2023 & 2024 year of pass outs with full-time education only (Part-time and distance educations are not considered)
                o   Note: MBA /PGDBM candidates are not eligible to apply for this role
                
                No active backlogs during application and/or during onboarding.
                You should have completed your relevant degree (eligible for this job role), in the stipulated duration of the degree. Hence, there should be no gaps during the course of your degree.
                o   Eg: You must complete your B.Tech in 4 years or M.Tech/MSc in 2 years.
                
                
                
                Your highest educational qualification only will be considered
                Candidate should not have appeared for Accenture Recruitment assessment/interview process in the last three months.
                Candidate should not have more than 11 months of experience
                Candidates must be eligible to work in India either by citizenship/ have relevant work permit documents.
                Please note that Bhutan and Nepal nationals can work in India without a need for obtaining a work visa. All other foreign nationals require work visa or an Overseas Citizenship of India (OCI) or Person of Indian Origin (PIO) card to work in India
                You are willing to work in any Business Unit/Service line within the company
                You are willing to join /relocate to any Accenture office across India
                
                Accenture has not authorized any agency, company or individual to either collect money or arrive on any monetary arrangement in exchange for a job at Accenture.  Accenture's  criterion  for  hiring  candidates  is merit. Any  agency, company or individual offering employment with Accenture in exchange for money is misrepresenting their relationship with Accenture, which has not authorized any such action. If you are approached by any entity or individuals who demand money or any other form of compensation in return for a job offer at Accenture - even if they present themselves as representatives or employees of Accenture - please send the details to Accenture Business Ethics Line https://businessethicsIine.com/accenture
            }
            else if(arr[i]< smallest && arr[i]!=secondSmallest){
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
        }

    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        int secondSmallest=getSecondSmallest(6, arr);
        System.out.println(secondSmallest);
        }
}