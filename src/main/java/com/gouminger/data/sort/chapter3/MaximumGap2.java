package com.gouminger.data.sort.chapter3;

import javafx.util.Pair;

import java.util.Arrays;

//最大间距
public class MaximumGap2 {

    /**
     * 给定一个无序的数组nums，返回 数组在排序之后，相邻元素之间最大的差值 。如果数组元素个数小于 2，则返回 0 。
     * 您必须编写一个在「线性时间」内运行并使用「线性额外空间」的算法。
     */
    public static void main(String[] args) {
        int[] nums = new int[]{3,6,9,1};
        System.out.println(maximumGap(nums));

        nums = new int[]{10};
        System.out.println(maximumGap(nums));

        nums = new int[]{20931212,514296171,418624802,521827410,713610803,785666644,53243977,27971816,699208170,37639503,441246056,881758333,457330452,582902386,861963933,416326704,882593245,78698769,440172416,434586927,869673606,652889930,731884257,529441264,311777459,161188959,20377472,644865829,870258130,172496408,315058247,501948728,109107979,482109421,444705722,500544824,384926877,842216195,809934277,761278197,204159338,901331991,954522798,265883604,656934763,977546695,481810121,557903616,541595938,832307520,203304669,509333144,339501876,490864329,618259971,128521729,670537475,239006770,666943231,241839130,855632236,943981462,417366307,167706079,811933708,238764154,312412742,683545151,175564371,252356289,601809370,236205976,455159078,476533781,340250003,129901925,830020238,120467674,688205153,130541209,477515046,21040495,928690984,136918050,888711109,694559728,127452082,311090940,767398996,465969295,421587038,831851536,53383655,659897488,721306458,382905524,544275223,651778352,176967013,398720884,844551925,266309543,302004016,535477225,51896094,393952104,375688569,138411197,1811785,679562987,909447760,930819732,684542099,216365861,228886700,605215696,779319211,356686218,650830969,22723774,83447247,628247432,30728000,218699645,789062242,162394387,180645652};
        System.out.println(maximumGap(nums));

        nums = new int[]{223602,87266,490508,841014,661152,190674,370408,794045,37766,171330,466055,289858,990782,478754,151080,119797,575579,504090,42909,166426,833216,845042,803740,235762,101741,806013,622868,774512,400496,965504,975006,90860,101350,32268,416928,709056,84139,44307,857070,391232,68322,155954,676396,126792,166938,560492,629120,543650,769374,872519,136960,578540,709512,62164,786080,217387,380364,195816,125997,484125,494800,152815,564234,817378,354332,781040,821715,738821,688581,781956,601478,852680,316388,776720,610876,820622,14660,955596,513710,399343,535356,89826,919405,104070,536210,142058,583346,254068,380374,388424,584920,987050,271656,310538,622915,801685,217042,877750,782400,992072,949695,299113,414484,222356,369222,139094,296906,679762,386220,844588,949042,126320,820208,655712,269207,549625,128141,70602,316522,603864,940120,999870,127657,566368,585530,910170,687360,774137,442504,466880,21312,32032,684475,941057,749505,230748,577306,689066,905324,347450,316992,376464,949568,339916,528242,383474,136345,139664,737737,733250,515805,278120,266816,305366,91511,552944,90840,556385,318834,326008,47476,377710,760380,160712,297591,363408,98314,911600,703019,406262,150016,85490,457109,180420,284546,861544,953619,660959,3253,54575,166096,292452,257544,678320,539992,857856,843455,317608,67584,172180,267362,95856,217898,735620,402764,550580,967424,706560,530750,901708,684824,450712,568693,998251,967352,265028,699122,24824,992358,36728,676769,327536,812416,986425,376182,724534,242243,92188,399110,136160,55146,322694,36000,844356,995370,564030,147092,843597,114102,961302,767100,971800,660135,600457,255594,321140,356690,842262,724202,205354,783248,636552,196616,416064,47135,685120,939912,388829,616100,748094,907122,871950,1932,147744,345108,641094,855652,74304,349918,805704,873152,365218,162040,348714,221817,841144,910728,965510,554564,252754,662670,607542,706520,137657,944917,65960,373824,895681,678177,63246,712564,448958,5244,789896,4170,853015,90709,669217,592374,447249,405667,537500,55123,686569,640432,45708,712324,135060,247878,396594,827364,508306,995324,740570,145124,766334,837612,941248,967604,138327,155652,513640,103936,168908,290778,278592,975755,734520,112369,666116,753259,636612,878032,488026,568405,607642,329919,615717,736567,137764,676297,311603,473750,506540,527268,218536,864592,435147,774189,667390,344640,303510,458305,303310,818672,908975,990102,567262,868081,901126,880080,880448,507742,488718,683903,150690,236600,914411,32964,442019,940824,665413,789557,772714,195235,878390,429359,255946,450611,274500,811051,974132,51720,411870,113903,227946,959995,657584,200254,929640,558450,601580,672460,575148,543428,619632,450789,110560,97927,130176,564568,314690,343952,900540,16374,998872,323416,724776,334832,88040,315338,122800,968433,973690,35820,826020,992524,815100,106060,24489,63872,720877,145882,492908,458416,26800,61164,683940,273969,555200,851420,429284,398420,178000,538170,497596,258007,902560,106850,205390,848333,490168,655736,244184,514941,554342,135199,336670,24745,443456,172100,14039,165537,182696,295822,638845,777551,940904,746320,548415,359396,277900,883326,451882,879756,734570,556778,505282,54872,295139,444796,739508,540956,12570,363224,336184,185697,449638,91968,265431,705038,375276,583960,101822,254090,164800,920637,269826,314536,585155,925667,306375,942430,293467,989326,858149,163346,944387,208400,714710,644384,71384,904924,56480,101384,651950,757534,728400,206600,616222,278284,49050,520568,44632,193890,971000,527728,314810,642632,114456,480276,545316,384361,130590,111370,425702,923140,999370,156500,60198,835760,13830,638368,809544,131802,702002,200102,990000,437458,305601,302381,221472,419530,805814,700534,142624,37655,506815,85318,406680,395290,173812,936952,492880,433270,484956,666192,552688,306432,247400,760266,291074,574741,247034,568700,84964,225052,379488,329280,798700,552137,380774,658336,679208,325441,322325,934812,641512,333138,845562,460640,64180,158346,3643,927304,566097,425495,482101,834311,558890,111250,615949,508956,149076,90836,456065,104428,679067,975168,209708,441844,135146,338325,181696,127405,926094,428215,580399,163696,615501,76576,291200,520271,968991,61850,724076,125620,561413,958759,877632,735192,317745,804312,573846,12240,440168,581148,750532,739270,279268,215654,495125,627300,324710,87736,582624,19911,540075,360428,403090,162016,257480,160910,512725,281788,707191,712619,649400,442747,577822,715984,559006,339406,820539,664104,86566,36208,982345,529456,621739,689034,604544,232768,973552,391012,47510,344860,924107,701000,817012,137828,995922,454955,833068,985527,423676,538014,925002,239939,658177,81706,910470,319700,58468,20876,161700,137664,901130,532320,61053,806826,711975,250234,122182,240330,814147,909640,741056,457767,384760,975277,988209,524760,703260,924494,455885,162160,895565,840612,694868,384736,896960,793644,772983,517688,889480,793446,391912,53044,893472,68936,789544,202040,464000,59120,783254,40242,319428,406686,751824,308440,427425,608801,45762,585822,954796,802936,136760,188248,518315,153824,553805,481280,435144,420587,958328,460347,263156,651730,184328,559949,474210,914198,669665,873424,833558,419160,813446,85456,114236,408709,965858,476322,585408,876400,340232,429536,520325,372900,633940,619059,295222,67414,320325,293936,781127,224657,528492,210913,805525,830128,728112,197266,215350,602069,347520,138672,470280,378285,816,228686,551298,55430,933762,84090,674392,417890,423240,845701,83516,525291,560770,553258,848725,654225,126310,681127,602208,104422,27352,487526,358723,927111,616000,936832,459040,151340,916233,724784,300747,277558,545326,649800,26976,803983,854556,801884,681210,22044,207334,744750,856056,749635,241000,455497,585240,759648,307130,385768,630808,195468,116010,805195,917230,146776,445549,377420,152106,19136,380300,442544,814041,762880,949348,117140,694796,33790,797220,232820,264276,189165,675855,888340,993392,59834,646490,888669,803962,874945,800712,907544,98460,705926,665924,848495,948408,660272,609515,192617,263208,136540,913740,482240,100675,956550,821100,785778,735645,976364,828978,312844,872260,842027,653260,608880,290208,209378,940851,26576,215435,830320,885152,123904,479326,512764,942976,585700,81243,273488,663858,441242,273575,865560,324460,364253,680278,863274,217106,791312,505704,247595,279292,182856,671047,829016,733395,586731,303186,890254,159896,784953,8280,515140,870752,780660,541056,486089,626262,309823,319200,417457,200880,79700,509214,10566,463900,420742,386112,336640,155327,189917,876271,235280,287040,968256,282464,972549,435264,74852,967632,838410,767403,82454,971946,192268,921465,518751,824765,969236,560656,824136,277913,392078,430270,971848,436574,588663,33001,552483,948482,833119,315966,813200,20386,851762,816030,188172,330616,621601,347019,772390,600672,346586,253697,670560,386864,419040,766174,331322,913272,152870,164295,913395,490668,589712,372549,476181,617268,633772,657176,929541,111468,559521,694437,846720,272800,746333,282788,540368,242628,101696,769221,664545,629462,25882,963976,270372,931040,558054,845400,781945,136704,880150,7669,723585,378848,327024,596904,86116,433532,418511,373684,122230,590518,214739,546361,301332,962242,856243,450348,846780,698054,974698,671330,309200,811895,865024,104750,12704,319316,666898,879905,863756,409670,33800,751319,963599,906340,724264,145776,473960,757511,384692,449575,916992,491300,974623,827616,196134,794120,350890,980556,797497,132360,929248,244439,409256,774936,786358,110060,142760,805420,126480,687514,855848,930735,888680,598750,358535,654912,574115,922884,951000,934000,773462,648806,112318,573568,970971,888708,917514,253202,42491,114365,424589,325452,376045,945912,497736,185760,436700,475540,49467,851399,84800,781792,189504,463350,821712,497740,462935,694479,620545,790522,664561,192118,598156,107384,455545,152404,588300,297152,536431,300109,528552,898060,113641,328928,159959,103856,120751,156280,497824,637641,53462,578890,21369,475990,372150,119102,451845,305192,197440,565000,550668,859982,986952,662016,569644,923940,530400,203136,167675,672125,412480,947088,4355,345000,973704,433460,70072,191436,848332,183900,486196,230000,455700,387008,890382,370295,603076,321225,526340,518848,863034,282044,871232,972432,608072,927630,928246,897986,766860,83084,762570,35171,618580,676003,942554,944832,372180,8240,150149,285308,667636,445374,332576,713086,810901,937563,332546,850620,736074,399060,973950,821474,659520,166300,970560,981984,887698,199722,432165,840216,936478,896250,404830,861217,644796,757254,828280,611360,401920,554998,332257,191008,143307,59769,150020,156290,8796,537693,755700,418712,628980,912178,373330,698154,751755,870534,165112,653443,780200,341744,761458,658634,668188,131776,85250,99061,815686,20300,909146,281250,475856,240254,504568,371940,316054,674324,789659,905544,165784,352792,813092,716000,449622,869411,370240,793140,454006,705755,236970,166668,18050,446824,659640,532885,768830,234556,798708,843529,983096,802738,796347,991423,489625,552160,991170,728305,178950,929905,800940,284968,940500,637586,82048,409984,705680,93830,150514,656096,900800,670252,244563,453944,361700,634785,846843,525868,252415,228213,939600,440496,515968,197080,539696,556924,262596,691448,786220,501885,262347,235203,621421,466360,758222,748024,209536,308408,46380,640800,471620,932172,626360,157902,11656,944328,282834,352152,296896,898208,203456,207612,677233,780693,981240,531150,224916,943725,756720,338056,861165,24268,286462,350500,280886,767613,211862,126972,455232,622462,828616,104736,673051,202956,565791,64062,616636,2505,778112,41935,502320,913136,728400,988618,842020,606300,931928,935589,982354,747254,15520,116070,889803,814864,580445,910281,812320,367758,358378,599781,114679,710470,53480,975288,68804,61980,205298,522982,250018,852663,448938,266632,193576,992332,578882,511502,317688,548397,306272,653416,927050,32544,490215,699677,548520,914430,73096,571066,20058,734043,428155,67040,294586,921772,734848,551100,769958,512365,59530,312399,896985,613456,139080,567255,331700,170100,15911,969105,185107,677270,537600,223583,931364,394600,234242,195840,606317,820684,993085,695660,713850,880005,237996,328240,812353,671402,50873,780710,657000,850182,340976,45230,120828,589606,710841,768300,735806,941568,319072,150356,786320,289145,49358,200410,505172,571292,813438,624975,476577,996284,60376,967138,311147,705388,684360,587315,286455,373160,435251,977558,955360,437120,481080,278080,998570,157400,967640,211245,786584,229022,649986,734900,503532,51898,668056,558400,956075,991998,507991,554090,234392,212720,654650,353820,584984,781680,875500,396356,683317,602675,679071,817232,555050,225453,65736,545360,956161,729410,979531,818792,131853,376354,48401,955847,502514,800790,728494,904274,674496,296435,413098,352028,702378,972784,120722,65304,9400,239990,626180,765942,554896,898854,655672,32000,88997,632106,878520,102656,140380,931680,961120,176872,289530,607490,188870,487920,907840,87924,983342,353040,58169,821558,885264,485238,331008,681704,125962,128890,260984,670634,836670,373000,582451,899730,815002,504971,383889,965295,73964,661204,988071,437053,749104,495725,45132,276581,178383,438972,19320,74925,322884,784634,744133,657157,974152,975760,365229,739120,213010,373099,796855,221422,815541,401198,494315,55356,369026,92195,146960,57302,168260,933905,747217,865891,490832,772800,660980,647135,373900,47738,673500,477636,101648,627941,900616,763018,771345,945953,233735,896921,537748,367299,360604,827042,36976,944684,295388,245897,141285,857900,815166,239952,922863,130390,164210,939676,882888,987860,369654,77778,920308,560072,735600,255050,141696,64240,256706,644416,187600,562424,298728,340896,866492,231264,373456,871386,656233,362400,31192,345900,238980,95033,921560,360484,351434,687693,12764,230922,413376,533852,401767,107640,170516,770376,603012,312760,370317,231075,584628,221832,603722,843112,180989,891163,757282,908298,768467,556582,164116,653868,749610,654088,874920,883260,113251,212100,334101,242214,487650,651008,939873,182606,884155,849014,815606,761541,922886,22833,7720,340510,977105,878432,830460,142304,556184,297888,269380,487252,842184,513969,46065,621208,290370,235983,218724,186308,163768,696345,193444,473871,915270,368349,695934,486371,797468,893391,933828,291320,629908,481964,521798,271100,740359,571274,427000,696133,475744,667204,703120,116924,631254,142655,328908,857750,773020,275904,816192,928935,366252,96784,195472,77504,186560,73456,229495,544231,608275,585302,940832,125019,606997,965290,46116,826402,946980,703983,752366,833923,719266,904150,14154,81824,704910,922731,804125,574500,30473,362070,345912,780436,138916,536,325600,217208,444746,495695,568600,926124,235904,438152,908226,76392,326768,180042,210560,521584,772996,366270,63175,987758,714908,972068,679068,621880,473792,644339,121038,632723,809365,89381,693103,16912,219626,451952,17216,606909,545440,197094,355572,554450,345660,52648,786290,57904,939100,749312,597902,816406,689365,988677,807114,868325,841856,880828,73919,649906,749536,404288,389022,638878,987310,238400,250585,286464,160473,70864,164648,40684,190048,143010,213056,935072,140552,383170,700410,447056,312780,902090,677955,410765,911033,587895,362206,134801,907531,723414,656150,232700,839358,966740,67942,368360,833320,705296,861796,619386,13991,210990,404275,493024,558300,764084,814384,210070,150912,749185,414288,660638,292505,316422,852728,342824,749586,708300,413923,247320,76600,250560,361985,774928,756285,281308,722760,352720,646410,694388,520312,761376,988006,468960,603884,456948,358057,586400,449004,747752,651650,544837,452696,132768,552522,644082,403102,304687,963543,435544,478284,372724,410940,722060,196808,937275,666040,481104,356302,476782,300000,947199,282560,704220,186266,229080,913125,711146,635026,139132,147646,577236,867789,965888,754636,84890,503156,689432,291804,590930,915750,373970,440305,983292,161420,633081,687805,551744,297517,323944,399675,668114,306856,722142,327765,965340,146675,741260,990720,510804,594924,692971,300990,208592,881889,110825,249192,998697,267265,663296,815720,491904,214036,964915,105502,568952,700690,130260,316006,423340,846616,833741,406408,177705,164480,991746,622478,795656,673489,715120,804032,689544,893705,142826,15594,601230,952570,948608,751040,118576,408026,219747,912104,783970,788188,764834,750156,624012,554666,909612,370854,473459,741521,384880,835200,102210,276390,623776,426608,118882,390146,813152,626176,943392,896658,866562,84865,554134,158915,111817,864680,973200,585995,645028,358124,73400,503072,38006,409480,380678,104140,217828,289440,465926,468852,738024,906492,989041,167136,927296,43272,930127,866195,642875,593884,917375,809110,146750,656816,815940,420576,866840,60312,790316,888463,356752,349360,566882,591306,659980,195712,896400,514348,787284,978928,344080,437185,190948,415952,638320,671582,658600,35472,819607,887342,419275,765820,480200,739145,162049,225304,910452,558820,756950,84472,546133,888260,550138,755650,706909,232153,150799,703664,67632,133820,64591,827400,12376,134663,46712,532631,528928,362944,695840,96543,882114,369270,11116,48383,965434,683200,398523,579616,939170,257398,277740,202229,313304,230655,90215,160000,108560,330432,470329,664566,109008,438360,101152,78344,432734,115618,372515,297356,297856,817712,215997,195031,277746,306841,377367,819132,127444,785952,852331,58037,393780,608008,132278,185916,459712,410472,597248,245870,756163,942027,664920,366333,190075,723874,380238,722615,762368,132657,669584,57286,43840,930652,378680,488284,527270,880,686382,989533,866825,239404,945980,740152,881676,903912,766057,668171,950794,379560,694120,344314,115638,248794,293299,809312,540900,765168,240160,398874,929736,645900,261440,749232,577522,701940,985586,558416,688446,29934,937060,480460,240717,753067,539192,100212,884160,650580,535328,32925,443377,578288,412738,922120,50252,728292,15163,906917,130492,779628,256360,123585,12420,698816,630738,930016,836787,486200,873806,592648,781971,825660,30298,399036,839466,990140,403171,812516,276192,634413,33500,670710,997530,735668,121339,247710,144466,42312,254784,549860,802930,657730,291255,392432,192073,641220,588878,716831,746576,693420,942694,359299,823754,357416,5794,721920,268177,30740,754360,519505,186625,787486,614235,296468,938000,24686,277658,249804,958056,273704,341952,698611,146235,105910,480447,692214,62487,227068,875425,345746,961710,817268,102596,558150,134120,213480,105560,914548,217986,979248,535200,556030,732892,524200,278090,73925,684846,793308,28000,23252,172663,32400,560040,716058,751598,788936,185995,517675,466077,295600,950560,346752,467018,171286,665619,84678,617224,781472,658144,405569,787704,451180,255771,571840,590264,927013,926096,946809,622178,273056,458480,943878,426325,562222,961607,966188,776002,4298,125952,166259,239737,646364,814816,100400,331540,84355,522127,363396,624221,383341,395769,433144,553633,161406,104388,394574,263026,256524,188380,608144,864979,636524,280047,250768,468392,842512,801345,362524,842276,320584,753630,919944,226693,858519,585373,48376,935937,524660,880856,482174,928214,877000,995064,146508,958400,368737,105550,342352,616579,988927,772108,135360,642299,904510,493754,834597,692255,886714,292048,140340,124835,954336,121696,62778,404200,236238,59568,942340,589988,615448,740,87547,765050,757076,89534,392692,431680,350352,209121,788170,559825,838407,396500,777170,848768,530525,664050,740800,249691,541348,152623,481257,258560,650500,297562,705388,491384,213312,661904,414425,202128,933203,785653,874120,674250,405805,386960,517549,459843,34920,684501,176196,131613,441334,523128,35870,377420,220332,313020,227300,409248,79614,394211,273856,886490,769054,936532,47264,347590,628888,878563,857503,336520,114805,996229,829953,552808,73384,572816,320450,708743,489209,314832,376129,61614,538140,393805,704550,128480,632924,224691,868148,960690,777652,513252,217792,709841,669482,389412,613805,224200,49271,576520,885845,396530,344908,813600,721454,494060,28628,818937,741504,863340,158256,860807,641888,298062,38593,941792,286051,147111,335104,941835,659826,273536,988378,477760,166100,172864,546776,312264,3559,875708,229163,594575,701610,76175,427810,748658,82944,183675,672470,199590,439082,186205,918900,380096,509082,976181,478650,470584,803980,949201,372000,97480,307490,789887,328580,183584,67358,224515,528660,686122,541626,902095,893692,175440,996336,877052,693844,301600,178780,385139,608179,666832,687100,137558,141865,547354,466720,216146,308390,60500,281739,661071,250589,801673,562591,141301,322652,315268,78450,955110,647504,924422,706144,470688,9942,768910,643558,417960,48846,320780,627100,769024,686992,754048,516130,126200,825980,500520,110036,607146,420166,423292,932132,55487,780200,105200,543552,958192,379438,280689,691484,630160,56008,769981,359928,54678,23636,533608,787440,788846,226941,757610,137366,562644,912298,325347,23068,556224,749575,370588,734500,384381,559742,587392,712555,912227,993195,958616,911616,200835,377973,600478,872050,611458,862902,447158,638176,898816,535170,292100,810732,442060,239128,255873,144400,223096,597144,178600,106190,447200,859550,568980,63002,95396,308216,69028,52712,800090,76120,211490,536604,383507,910080,684754,161966,547840,338320,503050,249648,296086,756876,529244,637840,526918,437360,289912,585600,242689,935376,566246,384536,828240,39679,646035,218987,233735,930329,431900,697284,668631,9750,580468,613250,3900,61280,511740,707125,994052,667560,911463,156796,421398,231270,3869,900190,748105,623687,26180,673040,46055,877464,155578,404224,854052,197344,185241,647496,301523,663736,995658,31049,145586,951000,175360,55928,856527,562860,929292,800483,282120,544799,54705,19218,441590,914796,945000,124616,779805,399510,324321,325082,631080,244597,79616,839616,554380,181766,242129,977868,172384,120299,145040,123520,552130,750666,179431,60384,672448,682432,358864,918444,727656,168050,722389,10320,469054,931502,338214,355810,826532,72797,121767,517310,461454,181042,600718,110776,991488,117954,633680,709608,454720,645026,637285,627852,494728,143124,850592,659624,976551,696960,824000,739660,573904,612320,150982,814956,261232,913536,336520,217827,889800,136944,424498,742354,299512,582080,779157,372520,188366,856544,268185,895955,636481,34388,204835,140608,325500,324944,578185,419172,32125,537051,93872,863992,697532,389838,349832,30768,132160,311848,437752,929375,753030,812124,923682,214000,959245,249200,428769,981540,596303,315162,832958,622002,757384,600345,50875,347740,846400,541785,713088,182688,386135,665746,639540,7140,891011,564207,189020,713910,294196,997936,477314,722088,531012,626424,845100,402920,149260,689696,449126,355582,445853,38208,430067,889483,191592,337832,364232,884761,174266,394972,662528,755860,672367,179045,707222,827295,803330,886436,28232,843712,487167,772672,786232,565165,881544,921255,149420,583657,558592,588863,413355,384992,822140,294582,260635,635404,472764,15652,965490,805745,443775,983360,9964,619190,460715,729472,997308,892750,599905,860936,8688,854439,856970,768960,649312,118668,891294,58680,659062,712823,839104,281000,96048,734044,765126,953360,771176,760355,565350,900780,728227,871552,602892,158106,369216,238496,637216,46560,331344,852132,371860,538890,680916,887326,686122,917315,543104,574080,55238,145428,502104,370123,871344,852160,788150,947958,306404,156945,766495,810720,388325,150424,667190,153830,142752,41592,751840,722590,622071,986076,904634,130480,780600,945815,253912,12720,186327,397382,508272,837444,553240,831180,326812,766120,241310,389760,970556,925640,643208,78518,669180,976783,118544,325240,52710,685820,171189,533471,889163,109922,674856,293495,318073,456990,79452,639876,313760,526246,586268,716245,444200,399940,234160,377598,813544,295820,953692,474468,189056,88158,353636,334010,589646,506341,933944,676055,588812,520686,219916,614712,790720,412292,887023,438660,976734,425860,476900,829176,680576,290460,857256,270968,839020,93638,594115,163396,166169,59268,6839,814081,127508,124356,162379,324180,160595,401211,576154,457501,945972,854800,794896,530624,182144,76308,653229,752300,390700,408191,536314,359556,923425,413845,165022,510792,825418,279916,360064,190470,269922,145341,398820,270836,821278,653950,136008,188210,356200,315199,388396,966467,477657,308000,597402,191606,880340,416256,620783,75738,238310,797134,280774,482935,825590,33625,683016,656876,492662,946739,963721,169700,56606,553026,648286,395100,776030,76158,860790,309859,117469,66499,144180,403604,407925,838296,731897,990160,655272,234277,819491,632944,806709,245456,402954,373098,552303,338190,492305,793186,30365,782950,286255,240561,942306,639288,897650,639925,381520,267911,75168,605495,467145,237900,883542,504000,211992,423376,640372,306775,354492,13720,174115,843320,747358,595256,851500,238208,340302,159826,153480,271623,877554,107784,828996,507032,863560,887750,528002,23956,313135,880080,246416,173115,813101,14176,522616,12639,464473,252184,882390,414854,596846,422170,855820,900765,620916,191260,29322,33220,880540,731835,41522,377916,515520,400930,453720,870528,82235,322716,630755,578745,898300,477184,793550,129516,140338,786456,324160,335588,163200,949568,823058,603547,77256,492100,486175,288271,375200,52295,960870,548495,836780,710270,937820,771680,692424,287328,844083,231404,568408,434830,32366,506862,996527,162816,565220,824736,380575,167255,53480,276888,410417,945932,28438,330000,420300,244796,192248,319547,76449,446090,258808,760526,247910,16222,386270,206960,498114,796665,862766,776400,394250,807483,856001,641183,414020,21400,772128,414716,456520,456221,726910,585121,239828,225920,49260,688390,940096,248006,3031,172480,157460,912493,62536,289040,566189,974468,759517,707579,89992,287245,803522,376963,126380,943081,277968,794822,569904,672032,809336,972874,759202,549410,835404,523526,468280,123566,145844,339514,968074,306179,136517,27008,656312,893120,747654,819570,485088,638046,972945,988808,237655,17640,257165,802924,735497,462398,979493,334056,69518,918317,309484,965604,746928,763011,181848,548480,936156,633389,451520,635400,983120,751768,448455,45055,402288,739440,159924,22271,45828,407808,151389,480216,280456,334681,599726,63500,426650,214590,334250,907945,201072,138638,495416,452240,185384,875958,723927,356224,176648,360778,652640,541760,54462,691834,972639,521898,635517,788299,194560,742600,487770,395787,661824,821894,955615,399248,250541,57856,606232,186650,824494,537942,281183,868619,414241,463560,974278,955232,945665,294400,854185,923088,650301,322845,186535,793020,333115,729667,979000,353320,588314,453816,497746,204100,634166,35998,919945,884538,580503,906938,727971,227797,879298,495654,148648,954248,286840,219232,665019,171848,537530,268017,933392,189149,917776,961106,751500,122388,153408,648990,545421,223684,412868,678038,842960,741690,846208,982834,230534,835686,878870,303270,519140,952700,78304,634135,447152,29612,34152,182673,932422,555002,273692,555672,420227,128614,103251,399428,538012,656040,652551,879847,203576,815726,257120,998855,940340,166700,471290,388664,929400,534008,257989,921209,328075,808430,41144,101708,513632,783880,831201,295460,194209,213692,633628,391084,260887,631920,212312,70210,921254,876892,31792,948928,129961,975360,476440,916496,325168,215833,14438,839280,706464,395990,889504,965796,741005,248430,112672,546000,136798,113656,144284,855528,254180,582104,625084,861580,376030,425093,348288,688793,49439,394784,40479,853370,722036,144580,106896,418152,744130,480115,738203,160646,915238,657391,167920,302510,466510,784430,457507,861648,189216,60648,360072,864202,933393,88050,701964,531775,269584,203560,450840,443949,945036,215230,534405,389374,401641,829748,284300,457880,201632,892510,992166,751490,485169,140852,958083,952240,567300,109563,653680,412605,288555,739845,728644,371984,993492,858818,418411,485881,918660,525104,771426,537796,845500,332800,604255,488839,984995,679916,989237,699655,507090,820374,44600,33925,592698,359782,606630,961445,600640,6355,70032,256316,734469,860334,703736,626279,420955,682660,100341,894100,285582,900078,878850,402911,866660,917298,737699,932404,600805,760816,836694,817534,945832,109808,79202,393240,893180,697372,94134,733260,372775,80064,185556,247586,975324,557015,89847,728115,841318,158790,229538,777360,437600,814230,703754,388880,170255,425794,669555,288090,437377,958244,201655,895024,659571,595936,52043,567901,222616,290336,425250,236410,871364,516360,822796,696181,373320,70896,234139,604255,250856,79797,721235,369972,542558,68216,338360,681920,653768,198560,990780,510572,171104,248470,984704,190400,724373,244636,202768,824992,568728,665312,325600,587875,401510,917100,18951,230604,262029,450208,164603,521308,635171,612000,250919,940710,966885,957502,717760,91704,636480,65326,3823,105058,794072,73008,200268,842623,294950,897285,155132,990825,377778,755996,258368,319516,896400,709127,114844,925700,906299,893792,657002,433949,155600,594780,982303,265344,733212,551695,294562,701120,716592,809200,644816,108190,216785,403897,491892,296202,893419,464672,258792,347492,936528,654016,934540,425384,15360,114700,819609,322880,751890,37760,499373,832990,479892,314554,866390,195755,555728,296131,180519,78066,822231,14868,487175,375710,821440,321813,739000,466610,833263,705800,754020,504745,265165,772464,961083,85072,331786,500444,303824,752734,280346,958832,467324,220980,72331,210097,884865,926990,290840,58839,693517,157294,38100,23034,107629,985120,21960,880001,154977,995382,968476,588528,336300,371839,539512,25708,296506,337569,574360,791472,491045,371620,970538,647621,240578,504470,878490,262380,646434,788190,376812,307700,954513,872748,402992,992720,847479,731340,436575,824768,490568,279823,622792,997263,408256,522576,349231,766188,146570,711952,888501,958576,371440,519163,817300,382416,1552,265288,83885,854214,229520,953736,717268,454600,465550,643158,567098,904909,659567,979940,762500,49066,705406,849164,862730,750890,396395,812825,808653,464320,836211,23022,971180,359615,382212,298224,917654,704875,89336,881752,162969,179260,573088,813790,55800,303536,559234,970582,62903,90800,998795,262841,63337,682320,567264,243442,991820,196092,112956,436034,387174,292632,953589,849274,424688,379646,765632,541744,315625,911192,287426,472280,605576,341901,804920,982432,978002,816542,291689,976600,339190,997416,49536,129263,98700,509490,914701,851650,344430,787673,9405,27400,657412,298842,729384,317116,194610,674609,449580,701406,849732,617500,289749,497942,474924,230092,559734,915136,85346,930465,826526,505237,381960,203540,746647,297404,690976,204140,801675,566519,456369,757876,882472,685418,553412,327623,657752,505100,803724,786880,746900,611077,227024,490966,807151,602932,630231,710418,717234,57324,998070,426354,452900,636658,391850,356254,796132,526833,403586,415260,847212,720572,903710,136320,979866,11916,924220,257664,273660,544020,522180,361152,834636,507864,898752,532784,723750,734212,690242,609894,863130,371822,205861,970288,921414,718156,38566,658042,597199,280309,352980,779840,757125,520630,775792,572854,432606,128280,800700,400960,410062,68988,632335,727200,318839,346400,746878,521400,482934,679272,958540,742697,552055,617300,793839,797692,920056,802182,114630,389935,691310,15240,335548,48060,117937,746817,793028,2251,922488,988712,404219,536808,96109,179983,636231,283946,610020,532200,107468,154733,453667,978774,496672,197130,529800,622482,117171,945191,400310,635244,97496,777600,582095,855980,800035,694751,119576,564375,262965,471630,777559,27915,533716,497580,882172,456560,601278,985296,483754,706908,45901,186048,680429,650195,293700,770042,631616,46248,478450,111057,81686,706840,461896,617996,539426,934240,634284,520020,619146,121903,216224,438822,663012,159390,526915,670160,429812,346225,344000,641470,617502,506830,95050,727948,189962,29463,908080,558892,536688,402928,73950,230865,827512,90806,605224,892860,340995,822601,89017,86086,683214,379854,790436,56287,288360,261360,203225,897233,688287,442070,275746,819380,512702,6200,36556,818624,428478,413172,69248,652842,180440,801984,20415,574950,417530,766441,201597,302238,153314,942692,141168,434075,913810,789872,683379,980700,890719,586725,775675,399635,730052,378678,825093,349746,787638,362140,985714,30132,655452,434026,163756,266680,117512,201686,585158,927910,220664,779375,892456,320376,61695,315886,73552,50652,997364,415023,843404,190728,946390,758347,782095,685189,427048,716326,886354,393932,269069,292812,133360,944774,333402,103413,69937,866542,69240,292192,740188,781680,246027,600055,322120,58080,317406,292064,441890,561550,59044,220960,690517,658991,120028,445388,999143,58580,515280,225451,318586,772984,593625,254390,222311,528652,633680,844276,933696,5064,278600,536430,562368,394362,598185,960855,272294,326296,485431,629140,200560,380984,889980,989034,46440,967073,966341,400726,528130,481352,665572,290967,837600,575172,810040,842825,297411,522400,346451,103750,845422,408704,538400,476058,759102,974494,903616,315884,60608,220688,430420,454969,575552,925361,3770,591689,655420,835208,287900,157850,422410,25780,969964,364480,611288,901664,115981,252810,161272,158344,360596,985328,5218,451876,550630,488769,987537,782560,943559,61879,354573,796000,178727,21532,995158,580808,497320,509215,252584,604750,357789,400100,677722,899672,490350,373230,386392,323576,270942,978300,660895,827752,234010,260840,614819,292350,562584,283024,614477,838720,720575,274550,108827,926792,636688,181683,969380,826584,530135,439075,102119,547485,120384,737674,66900,576536,89672,451462,320489,22977,169538,817045,107352,389300,978220,330448,57684,694338,518425,665718,942960,491735,390228,906672,792032,722270,646939,109620,236370,157030,62600,259482,15216,714752,176668,212566,655030,922015,763400,858100,681258,30563,69734,74484,982825,700012,243440,703733,318912,391496,90400,955712,641868,450864,714139,651682,463453,182984,469612,262464,696456,381328,873926,953940,749200,74812,922244,271330,591885,814768,867276,228220,415680,598250,549850,15490,619568,775159,509875,916280,55215,441439,974282,121947,512128,644480,82750,517120,205665,460686,719207,210960,648234,613594,477498,62183,528298,712440,697649,198240,580906,883050,52032,260345,248265,661760,489488,235631,809546,263750,604640,847360,767092,101624,283090,311560,5825,974730,685560,775756,305432,66166,545360,39872,353298,617899,341751,507440,234304,363100,513835,362390,863830,954912,236859,252805,357887,32166,135840,501747,205752,240025,617534,738596,396786,486052,638162,609704,19904,353320,544832,88313,421933,248772,891708,995008,15070,905954,809655,503438,397432,59568,995510,147308,234406,264244,380072,325568,976220,942254,115315,65527,862584,913588,685764,575918,406954,529088,477184,514662,787698,746705,573147,886332,554476,205432,339762,648442,646552,294784,916908,316921,832465,348432,852372,139440,940784,73395,948840,18456,192734,443005,600320,629970,760929,241680,448780,739652,161380,660448,889887,259552,403708,378876,701300,415790,838909,77696,570495,631304,922720,380635,529524,69799,780212,91872,151280,165620,17767,149440,712338,778612,937530,6632,38700,52921,629272,515296,906259,768216,161469,934272,206229,575152,676626,761520,594816,868027,182087,607325,201174,984514,113555,253462,165295,371679,143310,387604,261840,761888,134712,444269,672618,958688,839388,879280,655760,694976,44388,82368,433446,678563,501841,847489,962214,71373,598889,596220,211860,408302,241377,376712,356988,50830,9920,568169,29000,116822,284916,279466,598623,882500,401660,264158,208104,651256,167948,333072,815000,691278,167532,225896,350768,909648,218720,544860,488292,90800,969128,819205,281248,623644,146917,481678,435598,923138,152864,980223,287620,986560,375082,18464,414200,302859,922308,472374,788289,610176,965904,41632,39032,935515,970840,751675,178840,844128,651262,368227,930120,124738,568075,198927,420189,283232,305105,517732,957199,106800,287429,986360,148297,241695,261900,153564,882410,441112,232780,376090,804456,559987,35648,544285,91645,487456,269425,123125,993618,790709,637743,92112,175195,972415,984302,806356,814140,565464,987448,917400,436730,26642,417587,86600,32442,391912,632848,268730,419770,788445,327177,366610,48657,739256,631162,753903,782209,454928,186880,504065,960900,650206,212468,473616,15120,478712,329570,818806,36940,94672,253621,417022,39520,18478,989415,160534,937819,643234,258396,761234,26064,374127,934534,821062,575000,77996,729761,748577,488036,860960,545216,819736,691464,542656,850716,256990,577577,655972,596152,43210,766500,764084,437204,46755,92552,376312,536560,30150,558816,231377,627859,340525,923968,545970,843100,344578,899832,61224,217644,640576,547549,88885,200796,545344,558554,823844,840440,556672,132324,394392,523996,116584,186006,727072,968724,123896,839383,958564,545644,554866,677040,352070,812848,635945,186484,940086,774100,13579,904428,705062,697352,263020,414900,160224,344027,295481,423478,674600,748592,811000,430928,612366,249672,7459,129289,933888,536692,907958,634036,44584,586462,684381,774436,231651,798825,629544,703743,459514,286658,230360,805864,31720,150922,539612,111155,917224,520138,110548,365915,55280,87634,778777,424556,474748,941500,614250,35300,99396,461097,1820,692760,589178,438440,168320,388409,155458,808160,682645,221980,510507,234874,684072,135180,888936,475152,303485,80564,903430,468770,829748,699059,772005,164600,458476,298546,510336,455804,62506,224000,633500,613516,607712,438024,321732,937528,718980,911808,175284,602224,184584,56725,900720,296967,643131,991547,982374,341731,230802,888816,658278,27016,408647,30596,958082,582666,137780,787672,514901,210717,113670,590390,862712,690276,822056,196855,140682,917757,644432,360760,45700,632062,966684,829948,594480,326,233452,416898,166144,853634,890260,382900,913236,713472,880957,180278,358580,484033,414449,737681,876880,769184,853315,2445,668480,755038,127340,906460,798272,633080,410895,463586,338430,510230,751340,945600,40504,604635,323105,452370,600420,276,69948,999900,958812,362100,179985,129893,257410,36580,256330,465060,340000,18664,358395,515546,800800,545181,123600,903540,244500,285787,482599,606400,161638,153187,684416,511592,415367,43860,755717,912432,153156,765950,426868,53960,595990};
        System.out.println(maximumGap(nums));
    }

    public static int maximumGap(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return 0;
        }
        // 找到数组的最大值和最小值
        int max = -1;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        // 如果最大最小值一样，说明nums的值都是一样的，比如1, 1, 1, 1
        if (max - min == 0) {
            return 0;
        }

        // 定义桶数组，桶数组的长度为nums.length - 1，
        // 原因为：nums一共有n个元素，最大最小值不用放入桶中，所以只有n - 2个元素需要入桶，那么桶的数量要比
        // 需要入桶的元素数量多1，至少保证有1个桶是空桶，即size = n - 2 + 1 = n - 1。
        int[] bucketMax = new int[n - 1];
        int[] bucketMin = new int[n - 1];

        Arrays.fill(bucketMax, -1);
        Arrays.fill(bucketMin, Integer.MAX_VALUE);

        // 每个桶的范围，向上取整
        int interval = (int) Math.ceil((double) (max - min) / (n - 1));

        for (int num : nums) {
            // 最大最小值不入桶
            if (num == min || num == max) {
                continue;
            }
            // 计算在第几个桶
            int bucketID = (num - min) / interval;
            bucketMax[bucketID] = Math.max(bucketMax[bucketID], num);
            bucketMin[bucketID] = Math.min(bucketMin[bucketID], num);
        }

        int maxGap = 0;
        int prevMax = min;
        for (int i = 0; i < n - 1; i++) {
            // 假如是空桶，就跳过
            if (bucketMax[i] == -1) {
                continue;
            }
            // 最大间距 = 后一个桶的最小值 - 前一个桶的最大值
            maxGap = Math.max(maxGap, bucketMin[i] - prevMax);
            prevMax = bucketMax[i];
        }

        // 前边说了最大最小值不用入桶，如果最大值出现在最后，比如[1, 1000]，所以这里最终结果还要单独与max比较
        maxGap = Math.max(maxGap, max - prevMax);
        return maxGap;
    }

}
