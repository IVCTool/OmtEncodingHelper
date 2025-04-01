package org.nato.ivct.OmtEncodingHelpers.Netn.Base.datatypes;

import org.nato.ivct.OmtEncodingHelpers.Core.HLAroot;

import hla.rti1516e.encoding.DataElement;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.HLAinteger16BE;

/**
 * Represents the general class or nature of activity related to a 
 * simulated entity's mission.
 * 
 */
public enum AggregateMissionEnum16 {                
    Abdication(1),
    Accident(2),
    AccidentAircraftGround(3),
    Accident_Mine(4),
    Accident_Traffic(5),
    Accident_Weapon(6),
    Accident_Workplace(7),
    Advancing(8),
    AerialEngagement(9),
    AerialShootDown(10),
    AirAssault(11),
    AirborneAssault(12),
    AircraftCrash(13),
    AircraftLanding(14),
    AircraftLaunchActivity(15),
    AircraftLoss(16),
    AirspaceViolation(17),
    AlertCancellation(18),
    Ambush(19),
    AmphibiousOperation(20),
    ArmsProduction(21),
    ArmsTrade(22),
    Arresting_Legal(23),
    ArrestingOrObstructing(24),
    Arson(25),
    ArtilleryFire(26),
    Assassination(27),
    Assembling(28),
    AssistingACriminal(29),
    AtmosphericPollution(30),
    Attack_Deliberate(31),
    Attack_Diversion(32),
    Attack_Electronic(33),
    Attack_Hasty(34),
    Attack_Main(35),
    Attack_NotOtherwiseSpecified(36),
    Attack_Supporting(37),
    AttemptedMurder(38),
    AttemptedRape(39),
    AttemptedRobbery(40),
    AttemptedSuicide(41),
    Avoiding(42),
    BellyLanding(43),
    Blocking(44),
    Bombing(45),
    Bombing_Accidental(46),
    Bombing_Deliberate(47),
    BoobyTrapDiscovery(48),
    BorderCrossing_Escorted(49),
    BorderCrossing_Forced(50),
    BorderCrossing_Illegal(51),
    BorderCrossing_Not_Planned(52),
    BorderCrossing_Planned(53),
    BorderCrossing_Surveilled(54),
    BorderIncursion(55),
    BorderRaid(56),
    Breaching(57),
    Build_Up(58),
    BurnedOutObject(59),
    Bypass(60),
    Canalise(61),
    Capture(62),
    CarrierLaunch(63),
    CarrierRecovery(64),
    CBRN_EVENT(65),
    CeremonyOrParade(66),
    CivilDemonstration_Illegal(67),
    CivilDemonstration_Legal(68),
    CivilDisobedience(69),
    CivilUnrest(70),
    CivilWar(71),
    Clearing_Air(72),
    Clearing_LandCombat(73),
    Clearing_Obstacle(74),
    Clearing_RadioNet(75),
    CodewordExecution(76),
    Collision_Mid_Air(77),
    Collision_Obstacle(78),
    CommunicationsActivation(79),
    CommunicationsDeactivation(80),
    CommunicationsDisruption(81),
    CommunicationsInterception(82),
    CommunicationsOutage(83),
    CommunicationsRestoration(84),
    ConductingConference(85),
    ConductingForwardPassageOfLines(86),
    ConductingMediaInterview(87),
    ConductingPreparatoryFire(88),
    ConductingRearwardPassageOfLines(89),
    ConductingRecreationalActivities(90),
    ConductingRoadService(91),
    ConductingSocialEvents(92),
    ConductingSportingEvents(93),
    Confiscation(94),
    ConsolidatingOfAPosition(95),
    Constructing(96),
    Containing(97),
    Cooperating(98),
    CounterAttack(99),
    CounterAttackByFire(100),
    Counter_BatteryFire(101),
    CoupDetat(102),
    Covering(103),
    CrimeAgainstHumanity(104),
    CriminalIncident(105),
    Crossing(106),
    Dazzle(107),
    Death_NaturalCauses(108),
    DeathOfChiefOfState(109),
    DeathOfSpiritualLeader(110),
    Deception(111),
    Deception_Electronic(112),
    Defeat(113),
    Defending(114),
    Deflecting(115),
    Delaying(116),
    Demolition(117),
    Demonstration(118),
    Denying(119),
    Deploying(120),
    Destroying(121),
    Disease(122),
    Disengaging(123),
    Disrupting(124),
    Distributing(125),
    Diversion(126),
    Drive_ByShooting(127),
    Drought(128),
    DrugConsumption_Illegal(129),
    DrugDistribution_Illegal(130),
    DrugManufacturing_Illegal(131),
    DrugOperation(132),
    DrugStorage(133),
    DrugTransportation(134),
    EarlyWarningAlert(135),
    Earthquake(136),
    ElectionAssociatedViolence(137),
    ElectronicEmission(138),
    ElectronicWarfare(139),
    EnemyContact(140),
    Engaging(141),
    Enveloping(142),
    Epidemic(143),
    EquipmentFailure(144),
    Escaping(145),
    Escorting(146),
    Evacuating(147),
    Execution(148),
    Exploitation(149),
    Explosion(150),
    Famine(151),
    Fire(152),
    Firefighting(153),
    Fix(154),
    Fix_Acoustic(155),
    Fix_Electromagnetic(156),
    Fix_Electro_Optical(157),
    Flood(158),
    FollowingAndAssuming(159),
    FollowingAndSupporting(160),
    ForcedLanding(161),
    FriendlyFire(162),
    GeneratingChemicalSmoke(163),
    Genocide(164),
    GovernmentalCollapse(165),
    Guarding(166),
    Gunnery_Air_To_Air(167),
    Harassing(168),
    Hiding(169),
    Hijacking_Boat(170),
    Hijacking_LandVehicle(171),
    Hijacking_NotOtherwiseSpecified(172),
    Hijacking_Plane(173),
    Hold_Defensive(174),
    Hold_Offensive(175),
    HostageTaking(176),
    HumanRightsViolation(177),
    Hunting(178),
    Identifying(179),
    Illumination(180),
    IndirectFire(181),
    IndiscriminateShooting(182),
    IndustrialEspionageIncident(183),
    Infiltration(184),
    Interception(185),
    Interdiction(186),
    Intimidation(187),
    Invasion(188),
    Isolation(189),
    IssuingMediaArticle(190),
    IssuingMediaDocumentary(191),
    IssuingPressRelease(192),
    Jamming(193),
    Kidnapping(194),
    LabourStrike(195),
    Leaguer(196),
    LetterBombExplosion(197),
    LetterBombIncident(198),
    LocalElection(199),
    Locating(200),
    Looting(201),
    Maintaining(202),
    Marking(203),
    MartialLawImplementation(204),
    MassingOfForces(205),
    MassiveDeportationOrBanishment(206),
    MedicalEvacuation(207),
    MilitaryMobilisation(208),
    Mine_Laying(209),
    MissingIndividual(210),
    MissionStaging(211),
    MortarFire(212),
    Moving(213),
    Murder(214),
    MutualAssistancePactAgreement(215),
    NationalElection(216),
    NationalHoliday(217),
    NationalStateOfEmergency(218),
    NaturalDisaster(219),
    NavalGunFire(220),
    NavalPlatformFlightOperations(221),
    NetworkSeizure(222),
    Neutralize_Chemical(223),
    Neutralize_Combat(224),
    Neutralize_Explosive(225),
    Obscure(226),
    Observing(227),
    Occupying(228),
    Oceans_SeasOrWaterPollution(229),
    OffensiveOrCounteroffensive(230),
    OrganisedCrime(231),
    OutbreakOfRacialOrTribalOrEthnicWarfare(232),
    Patrolling(233),
    PeaceConference(234),
    PeaceTreatyAgreement(235),
    Penetrating(236),
    Pestilence(237),
    PetroleumProductSpills(238),
    Picketing(239),
    Poisoning(240),
    PoliticalDemonstration(241),
    PoliticalExecution(242),
    POWReturn(243),
    PrisonerExchange(244),
    Procuring(245),
    Protection_Electronic(246),
    ProvidingAccommodation(247),
    ProvidingAgriculturalSupport(248),
    ProvidingBedding(249),
    ProvidingCamps(250),
    ProvidingConstructionServices(251),
    ProvidingDecontaminationServices(252),
    ProvidingEducationServices(253),
    ProvidingHealthcareServices(254),
    ProvidingHostNationSupport(255),
    ProvidingInfrastructure(256),
    ProvidingLaundryServices(257),
    ProvidingRepairServices(258),
    ProvidingSecurityServices(259),
    ProvidingShelter(260),
    ProvidingStorageServices(261),
    ProvidingTranshipmentServices(262),
    Proxy_Bombing(263),
    PsychologicalOperation(264),
    PublishingMediaArticle(265),
    PublishingMediaDocumentary(266),
    PublishingPressRelease(267),
    Pursuing(268),
    Rape(269),
    Reconnaissance(270),
    ReconnaissanceInForce(271),
    Reconstituting(272),
    Recovering(273),
    Recuperating(274),
    Redeployment(275),
    RefugeeMovement(276),
    Reinforcing(277),
    ReliefInPlace(278),
    ReligiousDemonstration(279),
    ReligiousViolence(280),
    ReligiousWarfare(281),
    Rendezvous(282),
    Reorganising(283),
    Repairing(284),
    Resting(285),
    Resupplying(286),
    Retain(287),
    Retire(288),
    Revolution(289),
    Riot(290),
    Robbery(291),
    RocketFire(292),
    Sabotage(293),
    Screening(294),
    SecessionOfPortionOfCountry(295),
    Securing(296),
    SecurityCompromise(297),
    SecurityViolation(298),
    Seizing(299),
    ServingAsABreakoutForce(300),
    ServingAsABridgeheadForce(301),
    ServingAsAFlankGuard(302),
    ServingAsAMainBody(303),
    ServingAsAnAdvanceGuard(304),
    ServingAsAnIn_PlaceForce(305),
    ServingAsARearGuard(306),
    ServingAsAReserve(307),
    SettingUp(308),
    Shooting(309),
    SniperAttack(310),
    SpaceAccident(311),
    Spying(312),
    StateOfWar(313),
    Strafing_Aerial(314),
    Strike(315),
    Suicide(316),
    Supporting(317),
    Suppressing(318),
    Surrender(319),
    Surveillance_Electronic(320),
    SuspensionOfHostilities(321),
    Terrorism(322),
    Threaten(323),
    Torture(324),
    Transporting(325),
    Traversing(326),
    TreatyViolation(327),
    Troublemaking_Agitating(328),
    Troublemaking_Bullying(329),
    Troublemaking_Harassing(330),
    Troublemaking_Hooliganism(331),
    Troublemaking_Inciting(332),
    Troublemaking_Intimidating(333),
    Turning(334),
    UnexplodedOrdnanceDiscovery(335),
    VandalismOrRapeOrLootOrRansackOrPlunderOrSack(336),
    Verifying(337),
    VesselSinking(338),
    VolcanicEruption(339),
    WarOrCrisisAlert(340),
    WarOrMilitaryConference(341),
    WarCrime(342),
    WeaponFiring(343),
    Withdrawal(344),
    WithdrawalUnderPressure(345),
    Witnessing(346),
    NotOtherwiseSpecified(347),
    Stopped(348),
    Waiting(349),
    Other(0);


    private final HLAinteger16BE value;

    private AggregateMissionEnum16 (int value) {
        this.value = HLAroot.getEncoderFactory().createHLAinteger16BE((short)value);
    }

    public static AggregateMissionEnum16 decode(byte[] bytes) throws DecoderException  {
        HLAinteger16BE de = HLAroot.getEncoderFactory().createHLAinteger16BE();
        de.decode(bytes);
        switch (de.getValue()) {
            case 1: return Abdication;
            case 2: return Accident;
            case 3: return AccidentAircraftGround;
            case 4: return Accident_Mine;
            case 5: return Accident_Traffic;
            case 6: return Accident_Weapon;
            case 7: return Accident_Workplace;
            case 8: return Advancing;
            case 9: return AerialEngagement;
            case 10: return AerialShootDown;
            case 11: return AirAssault;
            case 12: return AirborneAssault;
            case 13: return AircraftCrash;
            case 14: return AircraftLanding;
            case 15: return AircraftLaunchActivity;
            case 16: return AircraftLoss;
            case 17: return AirspaceViolation;
            case 18: return AlertCancellation;
            case 19: return Ambush;
            case 20: return AmphibiousOperation;
            case 21: return ArmsProduction;
            case 22: return ArmsTrade;
            case 23: return Arresting_Legal;
            case 24: return ArrestingOrObstructing;
            case 25: return Arson;
            case 26: return ArtilleryFire;
            case 27: return Assassination;
            case 28: return Assembling;
            case 29: return AssistingACriminal;
            case 30: return AtmosphericPollution;
            case 31: return Attack_Deliberate;
            case 32: return Attack_Diversion;
            case 33: return Attack_Electronic;
            case 34: return Attack_Hasty;
            case 35: return Attack_Main;
            case 36: return Attack_NotOtherwiseSpecified;
            case 37: return Attack_Supporting;
            case 38: return AttemptedMurder;
            case 39: return AttemptedRape;
            case 40: return AttemptedRobbery;
            case 41: return AttemptedSuicide;
            case 42: return Avoiding;
            case 43: return BellyLanding;
            case 44: return Blocking;
            case 45: return Bombing;
            case 46: return Bombing_Accidental;
            case 47: return Bombing_Deliberate;
            case 48: return BoobyTrapDiscovery;
            case 49: return BorderCrossing_Escorted;
            case 50: return BorderCrossing_Forced;
            case 51: return BorderCrossing_Illegal;
            case 52: return BorderCrossing_Not_Planned;
            case 53: return BorderCrossing_Planned;
            case 54: return BorderCrossing_Surveilled;
            case 55: return BorderIncursion;
            case 56: return BorderRaid;
            case 57: return Breaching;
            case 58: return Build_Up;
            case 59: return BurnedOutObject;
            case 60: return Bypass;
            case 61: return Canalise;
            case 62: return Capture;
            case 63: return CarrierLaunch;
            case 64: return CarrierRecovery;
            case 65: return CBRN_EVENT;
            case 66: return CeremonyOrParade;
            case 67: return CivilDemonstration_Illegal;
            case 68: return CivilDemonstration_Legal;
            case 69: return CivilDisobedience;
            case 70: return CivilUnrest;
            case 71: return CivilWar;
            case 72: return Clearing_Air;
            case 73: return Clearing_LandCombat;
            case 74: return Clearing_Obstacle;
            case 75: return Clearing_RadioNet;
            case 76: return CodewordExecution;
            case 77: return Collision_Mid_Air;
            case 78: return Collision_Obstacle;
            case 79: return CommunicationsActivation;
            case 80: return CommunicationsDeactivation;
            case 81: return CommunicationsDisruption;
            case 82: return CommunicationsInterception;
            case 83: return CommunicationsOutage;
            case 84: return CommunicationsRestoration;
            case 85: return ConductingConference;
            case 86: return ConductingForwardPassageOfLines;
            case 87: return ConductingMediaInterview;
            case 88: return ConductingPreparatoryFire;
            case 89: return ConductingRearwardPassageOfLines;
            case 90: return ConductingRecreationalActivities;
            case 91: return ConductingRoadService;
            case 92: return ConductingSocialEvents;
            case 93: return ConductingSportingEvents;
            case 94: return Confiscation;
            case 95: return ConsolidatingOfAPosition;
            case 96: return Constructing;
            case 97: return Containing;
            case 98: return Cooperating;
            case 99: return CounterAttack;
            case 100: return CounterAttackByFire;
            case 101: return Counter_BatteryFire;
            case 102: return CoupDetat;
            case 103: return Covering;
            case 104: return CrimeAgainstHumanity;
            case 105: return CriminalIncident;
            case 106: return Crossing;
            case 107: return Dazzle;
            case 108: return Death_NaturalCauses;
            case 109: return DeathOfChiefOfState;
            case 110: return DeathOfSpiritualLeader;
            case 111: return Deception;
            case 112: return Deception_Electronic;
            case 113: return Defeat;
            case 114: return Defending;
            case 115: return Deflecting;
            case 116: return Delaying;
            case 117: return Demolition;
            case 118: return Demonstration;
            case 119: return Denying;
            case 120: return Deploying;
            case 121: return Destroying;
            case 122: return Disease;
            case 123: return Disengaging;
            case 124: return Disrupting;
            case 125: return Distributing;
            case 126: return Diversion;
            case 127: return Drive_ByShooting;
            case 128: return Drought;
            case 129: return DrugConsumption_Illegal;
            case 130: return DrugDistribution_Illegal;
            case 131: return DrugManufacturing_Illegal;
            case 132: return DrugOperation;
            case 133: return DrugStorage;
            case 134: return DrugTransportation;
            case 135: return EarlyWarningAlert;
            case 136: return Earthquake;
            case 137: return ElectionAssociatedViolence;
            case 138: return ElectronicEmission;
            case 139: return ElectronicWarfare;
            case 140: return EnemyContact;
            case 141: return Engaging;
            case 142: return Enveloping;
            case 143: return Epidemic;
            case 144: return EquipmentFailure;
            case 145: return Escaping;
            case 146: return Escorting;
            case 147: return Evacuating;
            case 148: return Execution;
            case 149: return Exploitation;
            case 150: return Explosion;
            case 151: return Famine;
            case 152: return Fire;
            case 153: return Firefighting;
            case 154: return Fix;
            case 155: return Fix_Acoustic;
            case 156: return Fix_Electromagnetic;
            case 157: return Fix_Electro_Optical;
            case 158: return Flood;
            case 159: return FollowingAndAssuming;
            case 160: return FollowingAndSupporting;
            case 161: return ForcedLanding;
            case 162: return FriendlyFire;
            case 163: return GeneratingChemicalSmoke;
            case 164: return Genocide;
            case 165: return GovernmentalCollapse;
            case 166: return Guarding;
            case 167: return Gunnery_Air_To_Air;
            case 168: return Harassing;
            case 169: return Hiding;
            case 170: return Hijacking_Boat;
            case 171: return Hijacking_LandVehicle;
            case 172: return Hijacking_NotOtherwiseSpecified;
            case 173: return Hijacking_Plane;
            case 174: return Hold_Defensive;
            case 175: return Hold_Offensive;
            case 176: return HostageTaking;
            case 177: return HumanRightsViolation;
            case 178: return Hunting;
            case 179: return Identifying;
            case 180: return Illumination;
            case 181: return IndirectFire;
            case 182: return IndiscriminateShooting;
            case 183: return IndustrialEspionageIncident;
            case 184: return Infiltration;
            case 185: return Interception;
            case 186: return Interdiction;
            case 187: return Intimidation;
            case 188: return Invasion;
            case 189: return Isolation;
            case 190: return IssuingMediaArticle;
            case 191: return IssuingMediaDocumentary;
            case 192: return IssuingPressRelease;
            case 193: return Jamming;
            case 194: return Kidnapping;
            case 195: return LabourStrike;
            case 196: return Leaguer;
            case 197: return LetterBombExplosion;
            case 198: return LetterBombIncident;
            case 199: return LocalElection;
            case 200: return Locating;
            case 201: return Looting;
            case 202: return Maintaining;
            case 203: return Marking;
            case 204: return MartialLawImplementation;
            case 205: return MassingOfForces;
            case 206: return MassiveDeportationOrBanishment;
            case 207: return MedicalEvacuation;
            case 208: return MilitaryMobilisation;
            case 209: return Mine_Laying;
            case 210: return MissingIndividual;
            case 211: return MissionStaging;
            case 212: return MortarFire;
            case 213: return Moving;
            case 214: return Murder;
            case 215: return MutualAssistancePactAgreement;
            case 216: return NationalElection;
            case 217: return NationalHoliday;
            case 218: return NationalStateOfEmergency;
            case 219: return NaturalDisaster;
            case 220: return NavalGunFire;
            case 221: return NavalPlatformFlightOperations;
            case 222: return NetworkSeizure;
            case 223: return Neutralize_Chemical;
            case 224: return Neutralize_Combat;
            case 225: return Neutralize_Explosive;
            case 226: return Obscure;
            case 227: return Observing;
            case 228: return Occupying;
            case 229: return Oceans_SeasOrWaterPollution;
            case 230: return OffensiveOrCounteroffensive;
            case 231: return OrganisedCrime;
            case 232: return OutbreakOfRacialOrTribalOrEthnicWarfare;
            case 233: return Patrolling;
            case 234: return PeaceConference;
            case 235: return PeaceTreatyAgreement;
            case 236: return Penetrating;
            case 237: return Pestilence;
            case 238: return PetroleumProductSpills;
            case 239: return Picketing;
            case 240: return Poisoning;
            case 241: return PoliticalDemonstration;
            case 242: return PoliticalExecution;
            case 243: return POWReturn;
            case 244: return PrisonerExchange;
            case 245: return Procuring;
            case 246: return Protection_Electronic;
            case 247: return ProvidingAccommodation;
            case 248: return ProvidingAgriculturalSupport;
            case 249: return ProvidingBedding;
            case 250: return ProvidingCamps;
            case 251: return ProvidingConstructionServices;
            case 252: return ProvidingDecontaminationServices;
            case 253: return ProvidingEducationServices;
            case 254: return ProvidingHealthcareServices;
            case 255: return ProvidingHostNationSupport;
            case 256: return ProvidingInfrastructure;
            case 257: return ProvidingLaundryServices;
            case 258: return ProvidingRepairServices;
            case 259: return ProvidingSecurityServices;
            case 260: return ProvidingShelter;
            case 261: return ProvidingStorageServices;
            case 262: return ProvidingTranshipmentServices;
            case 263: return Proxy_Bombing;
            case 264: return PsychologicalOperation;
            case 265: return PublishingMediaArticle;
            case 266: return PublishingMediaDocumentary;
            case 267: return PublishingPressRelease;
            case 268: return Pursuing;
            case 269: return Rape;
            case 270: return Reconnaissance;
            case 271: return ReconnaissanceInForce;
            case 272: return Reconstituting;
            case 273: return Recovering;
            case 274: return Recuperating;
            case 275: return Redeployment;
            case 276: return RefugeeMovement;
            case 277: return Reinforcing;
            case 278: return ReliefInPlace;
            case 279: return ReligiousDemonstration;
            case 280: return ReligiousViolence;
            case 281: return ReligiousWarfare;
            case 282: return Rendezvous;
            case 283: return Reorganising;
            case 284: return Repairing;
            case 285: return Resting;
            case 286: return Resupplying;
            case 287: return Retain;
            case 288: return Retire;
            case 289: return Revolution;
            case 290: return Riot;
            case 291: return Robbery;
            case 292: return RocketFire;
            case 293: return Sabotage;
            case 294: return Screening;
            case 295: return SecessionOfPortionOfCountry;
            case 296: return Securing;
            case 297: return SecurityCompromise;
            case 298: return SecurityViolation;
            case 299: return Seizing;
            case 300: return ServingAsABreakoutForce;
            case 301: return ServingAsABridgeheadForce;
            case 302: return ServingAsAFlankGuard;
            case 303: return ServingAsAMainBody;
            case 304: return ServingAsAnAdvanceGuard;
            case 305: return ServingAsAnIn_PlaceForce;
            case 306: return ServingAsARearGuard;
            case 307: return ServingAsAReserve;
            case 308: return SettingUp;
            case 309: return Shooting;
            case 310: return SniperAttack;
            case 311: return SpaceAccident;
            case 312: return Spying;
            case 313: return StateOfWar;
            case 314: return Strafing_Aerial;
            case 315: return Strike;
            case 316: return Suicide;
            case 317: return Supporting;
            case 318: return Suppressing;
            case 319: return Surrender;
            case 320: return Surveillance_Electronic;
            case 321: return SuspensionOfHostilities;
            case 322: return Terrorism;
            case 323: return Threaten;
            case 324: return Torture;
            case 325: return Transporting;
            case 326: return Traversing;
            case 327: return TreatyViolation;
            case 328: return Troublemaking_Agitating;
            case 329: return Troublemaking_Bullying;
            case 330: return Troublemaking_Harassing;
            case 331: return Troublemaking_Hooliganism;
            case 332: return Troublemaking_Inciting;
            case 333: return Troublemaking_Intimidating;
            case 334: return Turning;
            case 335: return UnexplodedOrdnanceDiscovery;
            case 336: return VandalismOrRapeOrLootOrRansackOrPlunderOrSack;
            case 337: return Verifying;
            case 338: return VesselSinking;
            case 339: return VolcanicEruption;
            case 340: return WarOrCrisisAlert;
            case 341: return WarOrMilitaryConference;
            case 342: return WarCrime;
            case 343: return WeaponFiring;
            case 344: return Withdrawal;
            case 345: return WithdrawalUnderPressure;
            case 346: return Witnessing;
            case 347: return NotOtherwiseSpecified;
            case 348: return Stopped;
            case 349: return Waiting;
            case 0: return Other;
            default: throw new IllegalArgumentException("Unknown value: " + de.getValue());
        }
    }

    public DataElement getDataElement() {
        return value;
    }

    public int getValue() {
        return value.getValue();
    }

}

