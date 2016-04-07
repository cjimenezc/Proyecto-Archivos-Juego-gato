# Proyecto-Archivos-Juego-gato
USE [Gato]
GO
/****** Object:  Table [dbo].[Juego]    Script Date: 06/04/2016 10:34:26 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Juego](
	[F1] [int] NULL,
	[F2] [int] NULL,
	[F3] [int] NULL,
	[F4] [int] NULL,
	[F5] [int] NULL,
	[F6] [int] NULL,
	[F7] [int] NULL,
	[F8] [int] NULL,
	[F9] [int] NULL,
	[Jugador1] [nvarchar](50) NULL,
	[Ganados1] [int] NULL,
	[Empates1] [int] NULL,
	[Perdidos1] [int] NULL,
	[Ficha1] [int] NULL,
	[Turno1] [bit] NULL,
	[Jugador2] [nvarchar](50) NULL,
	[Ganados2] [int] NULL,
	[Empates2] [int] NULL,
	[Perdidos2] [int] NULL,
	[Ficha2] [int] NULL,
	[Turno2] [bit] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Jugadores]    Script Date: 06/04/2016 10:34:26 p.m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Jugadores](
	[ID_Jugador] [int] IDENTITY(1,1) NOT NULL,
	[Jugador] [nvarchar](50) NULL,
	[Ganes] [int] NULL,
	[Empates] [int] NULL,
	[Perdidas] [int] NULL,
 CONSTRAINT [PK_Jugador] PRIMARY KEY CLUSTERED 
(
	[ID_Jugador] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
