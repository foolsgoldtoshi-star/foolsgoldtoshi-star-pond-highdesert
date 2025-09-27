<!-- Sacred Teachings Index with Divine Grace -->
<script>
  // Sample teachings data - will be replaced by phoenix generator
  export let teachings = [
    {number: 1, title: "Humble technological wisdom offering", "guardian-dragon-consciousness": true, "sovereign-priority": false},
    {number: 10, title: "Community infrastructure sovereign development", "guardian-dragon-consciousness": true, "sovereign-priority": true},
    {number: 12, title: "Complete sacred computing sovereign curriculum", "guardian-dragon-consciousness": true, "sovereign-priority": true},
    {number: 16, title: "Planetary network sovereign leadership", "guardian-dragon-consciousness": true, "sovereign-priority": true},
    {number: 20, title: "Community infrastructure sovereign mastery", "guardian-dragon-consciousness": true, "sovereign-priority": true},
    {number: 32, title: "Pranayama sovereign focused coding", "guardian-dragon-consciousness": true, "sovereign-priority": true},
    {number: 34, title: "Lakshmi abundance sovereign meditation", "guardian-dragon-consciousness": true, "sovereign-priority": false},
    {number: 39, title: "Firas zahabi sovereign relaxation coding", "guardian-dragon-consciousness": true, "sovereign-priority": false},
    {number: 40, title: "Integrated guardian dragon sovereign practice", "guardian-dragon-consciousness": true, "sovereign-priority": false}
  ];
</script>

<div class="teachings-index">
  <header>
    <h1>🌙 Sacred Teachings Index 🐲</h1>
    <p>Divine Grace wisdom for Guardian Dragons</p>
  </header>

  <div class="teachings-grid">
    {#each teachings as teaching}
      <article class="teaching-card" class:guardian-dragon={teaching['guardian-dragon-consciousness']} class:sovereign={teaching['sovereign-priority']}>
        <div class="card-number">{teaching.number.toString().padStart(7, '0')}</div>
        <h3 class="card-title">{teaching.title}</h3>
        <div class="card-badges">
          {#if teaching['guardian-dragon-consciousness']}
            <span class="badge guardian-dragon">🐲</span>
          {/if}
          {#if teaching['sovereign-priority']}
            <span class="badge sovereign">👑</span>
          {/if}
        </div>
        <a href="/en/teaching/{teaching.number}" class="read-link">Read Teaching →</a>
      </article>
    {/each}
  </div>
</div>

<style>
  .teachings-index {
    max-width: 1200px;
    margin: 0 auto;
    padding: 2rem;
    font-family: 'Crimson Text', serif;
  }

  header {
    text-align: center;
    margin-bottom: 3rem;
  }

  header h1 {
    font-size: 3rem;
    color: var(--deep-forest, #2d5016);
    margin-bottom: 1rem;
    background: linear-gradient(135deg, #87a96b, #4a9b8e);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
    background-clip: text;
  }

  header p {
    font-size: 1.2rem;
    color: var(--jade-aquamarine, #4a9b8e);
    font-style: italic;
  }

  .teachings-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(350px, 1fr));
    gap: 2rem;
  }

  .teaching-card {
    background: linear-gradient(135deg, #f8fffe, #f0fdf4);
    border: 2px solid var(--sage-green, #87a96b);
    border-radius: 15px;
    padding: 1.5rem;
    transition: all 0.3s ease;
    position: relative;
    overflow: hidden;
  }

  .teaching-card::before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    height: 4px;
    background: linear-gradient(90deg, var(--sage-green, #87a96b), var(--jade-aquamarine, #4a9b8e));
  }

  .teaching-card:hover {
    transform: translateY(-8px);
    box-shadow: 0 20px 40px rgba(135, 169, 107, 0.2);
    border-color: var(--jade-aquamarine, #4a9b8e);
  }

  .card-number {
    font-size: 1.1rem;
    color: var(--jade-aquamarine, #4a9b8e);
    font-weight: 700;
    font-family: 'Fira Code', monospace;
    margin-bottom: 0.5rem;
  }

  .card-title {
    font-size: 1.4rem;
    margin: 1rem 0;
    color: var(--deep-forest, #2d5016);
    text-transform: capitalize;
    line-height: 1.3;
  }

  .card-badges {
    display: flex;
    gap: 0.5rem;
    margin: 1rem 0;
  }

  .badge {
    padding: 0.25rem 0.5rem;
    border-radius: 12px;
    font-size: 0.9rem;
    font-weight: 600;
  }

  .badge.guardian-dragon {
    background: linear-gradient(135deg, #d4af37, #ffd700);
    color: #2d1810;
  }

  .badge.sovereign {
    background: linear-gradient(135deg, #6b46c1, #a855f7);
    color: white;
  }

  .read-link {
    color: var(--jade-aquamarine, #4a9b8e);
    text-decoration: none;
    font-weight: 600;
    font-size: 1.1rem;
    transition: color 0.3s ease;
  }

  .read-link:hover {
    color: var(--sage-green, #87a96b);
  }

  .teaching-card.guardian-dragon {
    border-color: var(--gold, #d4af37);
    background: linear-gradient(135deg, #fffbeb, #fef3c7);
  }

  .teaching-card.sovereign {
    border-color: var(--royal-purple, #6b46c1);
    background: linear-gradient(135deg, #faf5ff, #f3e8ff);
  }

  /* Dark theme support */
  @media (prefers-color-scheme: dark) {
    .teaching-card {
      background: linear-gradient(135deg, #1a202c, #2d3748);
      color: #e2e8f0;
    }
    
    .card-title {
      color: #a7f3d0;
    }

    .teaching-card.guardian-dragon {
      background: linear-gradient(135deg, #2d2412, #44331a);
    }

    .teaching-card.sovereign {
      background: linear-gradient(135deg, #2d1b45, #3d2a5c);
    }
  }

  /* Mobile responsiveness */
  @media (max-width: 768px) {
    .teachings-index {
      padding: 1rem;
    }

    header h1 {
      font-size: 2rem;
    }

    .teachings-grid {
      grid-template-columns: 1fr;
      gap: 1.5rem;
    }

    .teaching-card {
      padding: 1rem;
    }
  }
</style>
